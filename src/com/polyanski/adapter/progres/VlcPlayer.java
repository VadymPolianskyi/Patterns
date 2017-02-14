package com.polyanski.adapter.progres;

/**
 * Author: vadym
 * Date: 13.02.17
 * Time: 22:16
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
//      do nothing
    }
}
