package com.example.zero.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description : TODO
 * @author: meiqing
 * @date: 23/10/2023
 * @version: 1.0
 */
@RestController
public class HelloController {
    @GetMapping("hello")
    public String hello() {
        return "hello";
    }
}
