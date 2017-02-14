package com.polyanski.interpreter;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 11:00
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
