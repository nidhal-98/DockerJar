package com.example.DockerJar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class jarTestController {

    @GetMapping("/test")
    public String testing(){
        return "Hello";
    }
}
