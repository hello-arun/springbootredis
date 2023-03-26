package com.springbootredis.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {
    @GetMapping("/hello")
    public String hello() {
        return "Tata GoodBye See You gaya!!";
    }
    
    @GetMapping("/bye")
        public String bye() {
        return "Please tell me why???";
    }
}
