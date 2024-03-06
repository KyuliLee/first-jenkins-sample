package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
//    @GetMapping(value = "/", produces = {MediaType.APPLICATION_JSON_UTF_VALUE})
//    @GetMapping(value = "/", produces = {MediaType.APPLICATION_JSON})
    @GetMapping(value = "/")
    public Hello home() {
        return new Hello();
    }
}