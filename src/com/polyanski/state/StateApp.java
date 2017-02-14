package com.polyanski.state;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 14:46
 */
public class StateApp {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState());
    }
}
