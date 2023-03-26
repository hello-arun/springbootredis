package com.springbootredis.demo.repositories;

import org.springframework.stereotype.Repository;

import com.springbootredis.demo.models.MyRedisEntity;

@Repository
public interface MyRedisRepository {
    void save(MyRedisEntity entity);
    MyRedisEntity findById(String id);
    void deleteById(String id);
}
