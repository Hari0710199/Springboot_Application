package com.java.MultipleInheritaince;

import com.java.ImplementsExample.MediaPlayer;

public class MultiMediaPlayer implements MediaPlayer, AdvancedPlayerOptions {

    @Override
    public void play() {
        System.out.println("MultiMediaPlayer is Playing");
    }

    @Override
    public void pause() {
        System.out.println("MultiMediaPlayer is Paused");
    }

    @Override
    public void seek() {
        System.out.println("MultiMediaPlayer is being seeked");
    }

    @Override
    public void fastForward() {
        System.out.println("MultiMediaPlayer is being fast forwarded");
    }
}
