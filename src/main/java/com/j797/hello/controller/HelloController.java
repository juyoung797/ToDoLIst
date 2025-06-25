package com.j797.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "hello"; // hello.html 찾기
    }

    @GetMapping("/todolist")
    public String todolist() {
        return "to-do-list";
    }
}
