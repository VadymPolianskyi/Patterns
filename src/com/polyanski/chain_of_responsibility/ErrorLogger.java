package com.polyanski.chain_of_responsibility;

import com.polyanski.chain_of_responsibility.*;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 7:54
 */
public class ErrorLogger extends com.polyanski.chain_of_responsibility.AbstractLogger {
    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
