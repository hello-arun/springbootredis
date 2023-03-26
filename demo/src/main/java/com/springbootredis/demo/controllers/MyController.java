package com.springbootredis.demo.controllers;
import org.springframework.web.bind.annotation.RestController;

import com.springbootredis.demo.models.MyRedisEntity;
import com.springbootredis.demo.services.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class MyController {
    //
    
    @Autowired
    private MyService myService;

    @GetMapping("/save")
    public String save(String id, String name, String email) {
        MyRedisEntity entity = new MyRedisEntity(id, name, email);
        myService.save(entity);
        return "Saved to Redis";
    }

    @GetMapping("/find")
    public String find() {
        MyRedisEntity entity = myService.findById("123");
        return entity != null ? entity.getValue() : "Not found";
    }
}

