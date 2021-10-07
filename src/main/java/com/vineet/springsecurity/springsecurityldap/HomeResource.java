package com.vineet.springsecurity.springsecurityldap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeResource {
    @RequestMapping("/")
    public String index(){
        return "Home Page";
    }
}
