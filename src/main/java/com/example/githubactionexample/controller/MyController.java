package com.example.githubactionexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/")
public class MyController {
    @GetMapping("name")
    public Map test(){
        return Map.of("name","qweqqwer");
    }


}
