package com.github.abstractive.factory;

public class MysqlUser implements IUser {

    @Override
    public void insert(User user) {
        System.out.println("插入一条数据");
    }

    @Override
    public User getUserById(int userId) {
        System.out.println("获取一条数据");
        return null;
    }

}