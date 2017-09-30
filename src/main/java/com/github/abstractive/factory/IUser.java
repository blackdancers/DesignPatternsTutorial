package com.github.abstractive.factory;

/**
 * 操作数据库User表的接口
 */
public interface IUser {
    void insert(User user);
    User getUserById(int userId);
}