package cn.int1024.cat;

import cn.int1024.cat.common.core.redis.RedisCache;
import cn.int1024.cat.entity.po.User;
import cn.int1024.cat.entity.vo.UserInfo;
import cn.int1024.cat.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Description: RedisCacheTests
 * @Author: 双料特工·钏钐钾
 * @Date: 2022/10/14 14:38:00
 * @Version: 1.0
 */
@Slf4j
@SpringBootTest
class RedisCacheTests {
    @Autowired
    private RedisCache redisCache;

    @Autowired
    private UserMapper mapper;

    @Test
    void contextLoads() {
        UserInfo userInfo = mapper.getUserInfo(1);
        System.out.println(userInfo.toString());
//        redisCache.setCacheObject("hhh", "123");
//        String str = redisCache.getCacheObject("hhh");
//        log.debug(str);
//        User user = new User();
//        user.setAccount("ABC");
//        user.setPassword("********");
//        redisCache.setCacheObject("ABC", user);
//        User redisUser = redisCache.getCacheObject("ABC");
//        log.debug(redisUser.getAccount());
//        log.debug(redisUser.getPassword());
//        redisCache.deleteObject("ABC");
//        redisCache.deleteObject("hhh");
    }
}