package com.gokul.interfaces;

public class CDplayer implements Media{
    @Override
    public void start() {
        System.out.println("play the music");
    }

    @Override
    public void stop() {
        System.out.println("Stop the music");

    }
}
