package com.github.abstractive.factory;


/**
 *
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException,
            IllegalAccessException, InstantiationException {
//        IFactory factory = new MysqlFactory();
//        IUser user = factory.createUser();
//        user.insert(new User());
//        user.getUserById(111);

        Class clazz = Class.forName("com.github.abstractive.factory.MysqlUser");
        Object instance = clazz.newInstance();
        if (instance instanceof MysqlUser){
            MysqlUser user1 = (MysqlUser) instance;
            user1.insert(new User());
            user1.getUserById(111);
        }
        //System.out.println(instance instanceof MysqlUser);
    }
}
