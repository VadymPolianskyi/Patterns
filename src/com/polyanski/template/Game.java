package com.polyanski.template;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 15:06
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    public final void play(){
        initialize();

        startPlay();

        endPlay();
    }
}
