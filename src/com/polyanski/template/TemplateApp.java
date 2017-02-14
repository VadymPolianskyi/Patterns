package com.polyanski.template;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 15:07
 */
public class TemplateApp {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
