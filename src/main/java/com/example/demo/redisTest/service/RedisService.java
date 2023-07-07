package com.example.demo.redisTest.service;

public interface RedisService {

    void setKeyAndValue(String token, Long accountId);
    Long getValueByKey(String token);
    void deleteByKey(String token);
}
