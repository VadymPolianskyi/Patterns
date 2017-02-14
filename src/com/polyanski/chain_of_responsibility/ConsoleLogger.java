package com.polyanski.chain_of_responsibility;

import com.polyanski.chain_of_responsibility.*;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 7:53
 */
public class ConsoleLogger extends com.polyanski.chain_of_responsibility.AbstractLogger {
    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}