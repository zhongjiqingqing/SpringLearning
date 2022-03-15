package com.kuang.pojo;

/**
 * @author 终极庆庆
 * @version 1.0
 * @date 2022/3/4 1:35 下午
 */
public class Client {
    public static void main(String[] args) {
        Host host = new Host();

        Proxy proxy = new Proxy(host);

        proxy.rent();
    }
}
