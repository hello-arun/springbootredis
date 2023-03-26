package com.springbootredis.demo.repositories;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;
import com.springbootredis.demo.models.MyRedisEntity;
import com.springbootredis.demo.config.RedisConfig;
import org.springframework.context.annotation.Import;

@Repository
@Import(RedisConfig.class)
public class MyRedisRepositoryImpl implements MyRedisRepository {
    private final RedisTemplate<String, MyRedisEntity> redisTemplate;
    private static final String KEY_PREFIX = "myredisentity:";

    public MyRedisRepositoryImpl(RedisTemplate<String, MyRedisEntity> redisTemplate) {
    	//super();
        this.redisTemplate = redisTemplate;
    }

    @Override
    public void save(MyRedisEntity entity) {
        String key = KEY_PREFIX + entity.getId();
        redisTemplate.opsForValue().set(key, entity);
    }

    @Override
    public MyRedisEntity findById(String id) {
        String key = KEY_PREFIX + id;
        return redisTemplate.opsForValue().get(key);
    }

    @Override
    public void deleteById(String id) {
        String key = KEY_PREFIX + id;
        redisTemplate.delete(key);
    }
}