package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//@Controller
@RestController
public class DemoController {

    @GetMapping("/demo")
    public String demo(){
        // controller
        // service
        // dao database
        return "hello world";
    }


    @GetMapping("/demo/demo2")
    public String demo2(){
        return "hello world 2";
    }
}
