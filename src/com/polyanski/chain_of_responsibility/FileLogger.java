package com.polyanski.chain_of_responsibility;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 7:54
 */
public class FileLogger extends com.polyanski.chain_of_responsibility.AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
