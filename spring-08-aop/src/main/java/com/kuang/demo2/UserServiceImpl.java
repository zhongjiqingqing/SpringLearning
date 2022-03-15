package com.kuang.demo2;

/**
 * @author 终极庆庆
 * @version 1.0
 * @date 2022/3/4 1:50 下午
 */
public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("增加");
    }

    @Override
    public void delete() {
        System.out.println("删除一个用户");
    }

    @Override
    public void update() {
        System.out.println("修改");
    }

    @Override
    public void query() {
        System.out.println("查询一个");
    }
}
