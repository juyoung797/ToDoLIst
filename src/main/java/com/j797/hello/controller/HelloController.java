package com.j797.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/")
    public String home() {
        return "home"; // hello.html 찾기
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/todolist")
    public String todolist() {
        return "todolist";
    }

    @GetMapping("/portfolio")
    public String portfolio() {
        return "portfolio";
    }
}
