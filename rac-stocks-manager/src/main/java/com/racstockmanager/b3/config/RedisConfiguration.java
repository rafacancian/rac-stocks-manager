package com.racstockmanager.b3.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedisConfiguration {

    @Bean()
    public RedissonClient redisson(@Value("${redis-properties.host}") String host,
                                   @Value("${redis-properties.port}") String port) {
        //ApplicationConfigurationRedisProperties redisProperties,
        // ObjectMapper objectMapper) {

        Config config = new Config();
        //config.setCodec(new TypedJsonJacksonCodec(new TypeReference<String>() {
        // }, new TypeReference<>() {
        //}, objectMapper));

        config.useSingleServer().setAddress("redis://" + host + ":" + port);

        return Redisson.create(config);
    }
}
