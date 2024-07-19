package com.example.blondiebytes.tutorial.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping(path = "/greeting", method = RequestMethod.GET)
    public String getGreeting() {
        return "Hi it's me sungenchuang7 and I like boba";
    }
}
