package com.java.ImplementsExample;

import com.java.MultipleInheritaince.MultiMediaPlayer;

public class MultiInheritanceMain {
	public static void main(String[] args) {
		AudioMediaPlayer audioMediaPlayer = new AudioMediaPlayer();
		audioMediaPlayer.play();
		audioMediaPlayer.pause();

		VideoMediaPlayer videoMediaPlayer = new VideoMediaPlayer();
		videoMediaPlayer.play();
		videoMediaPlayer.pause();
		MultiMediaPlayer multiMediaPlayer = new MultiMediaPlayer();
		multiMediaPlayer.play();
		multiMediaPlayer.pause();
		multiMediaPlayer.seek();
		multiMediaPlayer.fastForward();
	}
}
