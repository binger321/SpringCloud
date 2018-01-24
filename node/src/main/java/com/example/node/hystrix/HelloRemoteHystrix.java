package com.example.node.hystrix;


import com.example.node.Interface.HelloRemote2;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloRemoteHystrix implements HelloRemote2 {

    @Override
    public String hello2(@RequestParam(value = "name") String name) {
        return "hello" +name+", node 1 this message send failed ";
    }
}