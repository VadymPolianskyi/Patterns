package com.polyanski.state;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 14:44
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
