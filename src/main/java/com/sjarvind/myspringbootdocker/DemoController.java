package com.sjarvind.myspringbootdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String dockerSaysSuccess() {
        System.out.println("Im running inside docker");
        return "Im running inside docker";
    }
}
