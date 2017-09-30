package com.github.sample.factory.method;

import com.github.sample.factory.Operation;

/**
 * 客户端
 */
public class Main {
    public static void main(String[] args){
        IFactory operaFactory = new FactoryOperationAdd();
        Operation oper = operaFactory.createOperation();
        oper.setNumberA(1);
        oper.setNumberB(2);
        
        System.out.println(oper.getResult());
    }
}