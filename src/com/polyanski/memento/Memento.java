package com.polyanski.memento;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 11:26
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
