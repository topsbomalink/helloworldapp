package com.example.HelloWorldApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("/greeting")
    public String greeting(@RequestParam(value = "name") String name,
                           @RequestParam(value="time") String time){
        return String.format("Hello World! %s, Good %s",name,time);
    }

}
