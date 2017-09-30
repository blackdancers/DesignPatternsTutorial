package com.github.sample.factory;

/**
 * 简单工厂设计模式
 */
public class Main {
    public static void main(String[] args) {
        Operation oper;
        oper = OperationFactory.createOperation("+");
        oper.setNumberA(1);
        oper.setNumberB(2);
        System.out.println(oper.getResult());
    }

}