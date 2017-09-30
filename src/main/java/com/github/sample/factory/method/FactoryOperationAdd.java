package com.github.sample.factory.method;

import com.github.sample.factory.Operation;
import com.github.sample.factory.OperationAdd;

/**
 * 加法工厂类
 */
public class FactoryOperationAdd implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }

}