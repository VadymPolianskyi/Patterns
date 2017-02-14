package com.polyanski.state;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 14:44
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
