package com.kuang.demo2;

/**
 * @author 终极庆庆
 * @version 1.0
 * @date 2022/3/4 1:56 下午
 */
public class Client {
    public static void main(String[] args) {
        //真实业务
        UserServiceImpl userService = new UserServiceImpl();
        //代理类
        UserServiceProxy proxy = new UserServiceProxy();
        //使用代理类实现日志功能！
        proxy.setUserService(userService);

        proxy.add();
    }

}
