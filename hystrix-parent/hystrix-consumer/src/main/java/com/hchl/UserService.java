package com.hchl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author 翟永超
 * @create 2017/7/25.
 * @blog http://blog.didispace.com
 */
@Service
public class UserService
{

    @Autowired
    RestTemplate restTemplate;
    //
    // @HystrixCollapser(
    // scope = com.netflix.hystrix.HystrixCollapser.Scope.GLOBAL,
    // batchMethod = "findByIds",
    // collapserProperties = {
    // @HystrixProperty(name="timerDelayInMilliseconds", value = "100")
    // }
    // )
    // public Future<String> findById(Long id) {
    // return null;
    // }
    //
    // @HystrixCommand(commandProperties = @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",
    // value = "5000"))
    // public List<String> findByIds(List<Long> ids) {
    // List<String> result = restTemplate.getForObject("http://hystrix-collapser-provider/users?ids={1}",
    // List.class, StringUtils.join(ids, ","));
    // return result;
    // }

    @HystrixCommand(fallbackMethod = "fallback") // 指定服务降级的方法
    public String consumer()
    {
        String r =restTemplate.getForObject("http://hystrix-provider/getUser", String.class);
        return r;
    }

    public String fallback()
    {
        return "fallback";
    }

}
