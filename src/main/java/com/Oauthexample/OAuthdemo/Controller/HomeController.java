package com.Oauthexample.OAuthdemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public  String Home(){
        return "Welcome to the Home Page";
    }
    @GetMapping("/secured")
    public  String Secured(){
        return "Welcome to the Secured Page";
    }
}
