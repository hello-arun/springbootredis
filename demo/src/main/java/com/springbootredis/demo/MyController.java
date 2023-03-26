package com.springbootredis.demo;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api") // Routes
public class MyController {
    @GetMapping("/hello") // Routes
    public String hello() {
        return "Tata GoodBye See You gaya!!";
    }
    
    @GetMapping("/bye")
    public String bye() {
        return "Please tell me why???";
    }
}
