package com.java.ExtendsExample;

public class ExtendsMainExample {

	public static void main(String[] args) {
		Media media = new Media();
		media.setId(001);
		media.setTitle("Media1");
		media.setArtist("Artist001");

		AudioMedia audioMedia = new AudioMedia();
		audioMedia.setId(101);
		audioMedia.setTitle("Audio1");
		audioMedia.setArtist("Artist101");
		audioMedia.setBitrate(3500);
		audioMedia.setFrequency("256kbps");

		VideoMedia videoMedia = new VideoMedia();
		videoMedia.setId(201);
		videoMedia.setTitle("Video1");
		videoMedia.setArtist("Artist201");
		videoMedia.setResolution("1024x768");
		videoMedia.setAspectRatio("16:9");

		System.out.println(media);
		System.out.println(audioMedia);
		System.out.println(videoMedia);


	}

}
