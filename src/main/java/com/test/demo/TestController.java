package com.test.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "test")
public class TestController {

    @GetMapping(value = "hello")
    public String hello(){
        return "HELLO MIGUEL";
    }

}
