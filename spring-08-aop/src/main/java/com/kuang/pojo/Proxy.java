package com.kuang.pojo;

/**
 * @author 终极庆庆
 * @version 1.0
 * @date 2022/3/4 1:35 下午
 */
public class Proxy implements Rent{
    private Host host;
    public Proxy() { }
    public Proxy(Host host) {
        this.host = host;
    }

    //租房
    public void rent(){
        seeHouse();
        host.rent();
        fare();
    }
    //看房
    public void seeHouse(){
        System.out.println("带房客看房");
    }
    //收中介费
    public void fare(){
        System.out.println("收中介费");
    }
}
