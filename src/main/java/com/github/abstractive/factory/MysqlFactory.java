package com.github.abstractive.factory;

public class MysqlFactory implements IFactory {

    @Override
    public IUser createUser() {
        return new MysqlUser();
    }

}