package com.kuang.config;

import com.kuang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author 终极庆庆
 * @version 1.0
 * @date 2022/3/4 1:11 下午
 */
@Configuration
@Import(Config2.class)
public class KuangConfig {

    @Bean
    public User getUser(){
        return  new User();
    }
}
