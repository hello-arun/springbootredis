package com.springbootredis.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {
    @GetMapping("/hello")
    public String getUser(@RequestParam(defaultValue = "Guest") String name, @RequestParam(defaultValue = "0") int age) {
    return "Hello, " + name + "! You are " + age + " years old.";
    }
    
    @GetMapping("/bye")
        public String bye() {
        return "Please tell me why???";
    }
}
