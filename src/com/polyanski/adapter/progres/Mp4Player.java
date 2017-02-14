package com.polyanski.adapter.progres;

/**
 * Author: vadym
 * Date: 13.02.17
 * Time: 22:17
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
//      do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
