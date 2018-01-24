package com.example.node.Interface;

import com.example.node.hystrix.HelloRemoteHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "spring-cloud-producer2",fallback = HelloRemoteHystrix.class)
public interface HelloRemote2 {
    @RequestMapping(value = "/hello")
    String hello2(@RequestParam(value = "name") String name);
}