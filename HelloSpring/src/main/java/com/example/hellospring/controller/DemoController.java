package com.example.hellospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String index(){
        return "index.html";
    }

    @GetMapping("echo/parameter")
    public String parameter(@RequestParam String input){
        return input;
    }

    @GetMapping("hejdat22b")
    public String hejdat(){
        return "Hey<br>med<br>dig.";
    }
}
