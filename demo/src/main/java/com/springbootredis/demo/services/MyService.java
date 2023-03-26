package com.springbootredis.demo.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springbootredis.demo.repositories.MyRedisRepositoryImpl;
import com.springbootredis.demo.models.MyRedisEntity;

@Service
public class MyService {
    @Autowired
    private MyRedisRepositoryImpl myRedisRepository;

    public void save(MyRedisEntity entity) {
        myRedisRepository.save(entity);
    }

    public MyRedisEntity findById(String id) {
        return myRedisRepository.findById(id);
    }
}
