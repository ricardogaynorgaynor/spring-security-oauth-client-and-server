package com.example.oauth.oaththirddemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class MainController {

//    @GetMapping(value = "/hello")
//    public String sayHello(){
//        return "Hello world";
//    }

    @GetMapping(value = "/principal")
    public Principal pricipal(Principal principal){
        return principal;
    }

}
