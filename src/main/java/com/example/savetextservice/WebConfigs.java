package com.example.savetextservice;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

@Configuration
public class WebConfigs {
    @Bean("webCache")
    public Cache<Long, IpInfo> cache(){
        return CacheBuilder.newBuilder()
                .maximumSize(1000)
                .expireAfterWrite(10, TimeUnit.DAYS)
                .build();
    }
}
