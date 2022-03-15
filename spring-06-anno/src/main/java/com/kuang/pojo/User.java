package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * @author 终极庆庆
 * @version 1.0
 * @date 2022/3/4 12:45 下午
 */


@Component
// 相当于配置文件中 <bean id="user" class="当前注解的类"/>
@Controller("user")
@Scope("prototype")
public class User {


    public String name;

    @Value("zjqq")
    public void setName(String name) {
        this.name = name;
    }
}
