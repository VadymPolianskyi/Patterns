package com.polyanski.strategy;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 14:52
 */
public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
