package edu.xja;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

public class RedisTest extends BaseTest{
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Test
    public void test1(){

        //stringRedisTemplate.opsForValue().set("name", "zhangsan");
        stringRedisTemplate.boundValueOps("name").set("lisi");
    }
}
