package com.springboot.redis.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.script.DefaultRedisScript;
import org.springframework.data.redis.serializer.StringRedisSerializer;


/**
 * @author : lisy
 * @version $Id: RedisConfig, v 0.1 2019年10月15日 下午8:44 lisy Exp $
 */
@Configuration
public class RedisConfig {

    /**
     * springboot 对Redis key 的序列化方式做了改变
     * @param redisTemplate
     * @return
     */
    @Bean
    public RedisTemplate getRedisTemplate(RedisTemplate redisTemplate) {
        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
        redisTemplate.setValueSerializer(stringRedisSerializer);
        redisTemplate.setKeySerializer(stringRedisSerializer);
        redisTemplate.setHashKeySerializer(stringRedisSerializer);
        redisTemplate.setHashValueSerializer(stringRedisSerializer);
        redisTemplate.afterPropertiesSet();
        return redisTemplate;
    }
}
