package com.kuang.demo2;

/**
 * @author 终极庆庆
 * @version 1.0
 * @date 2022/3/4 1:53 下午
 */
public class UserServiceProxy implements UserService{

    private  UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        log("update");
userService.update();
    }

    @Override
    public void query() {
        log("query");
userService.query();
    }

    public void log(String msg){
        System.out.println("是用来"+msg+"方法");
    }
}
