package com.polyanski.chain_of_responsibility;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 7:55
 */
public class ChainApp {

    private static com.polyanski.chain_of_responsibility.AbstractLogger getChainOfLoggers() {
        com.polyanski.chain_of_responsibility.AbstractLogger errorLogger = new ErrorLogger(com.polyanski.chain_of_responsibility.AbstractLogger.ERROR);
        com.polyanski.chain_of_responsibility.AbstractLogger fileLogger = new FileLogger(com.polyanski.chain_of_responsibility.AbstractLogger.DEBUG);
        com.polyanski.chain_of_responsibility.AbstractLogger consoleLogger = new ConsoleLogger(com.polyanski.chain_of_responsibility.AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        com.polyanski.chain_of_responsibility.AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(com.polyanski.chain_of_responsibility.AbstractLogger.INFO,
                "This is an information.");

        loggerChain.logMessage(com.polyanski.chain_of_responsibility.AbstractLogger.DEBUG,
                "This is an debug level information.");

        loggerChain.logMessage(com.polyanski.chain_of_responsibility.AbstractLogger.ERROR,
                "This is an error information.");
    }
}