package com.java.ExtendsExample;

public class AudioMedia extends Media {

	private int bitrate;
	private String frequency;

	public AudioMedia(int bitrate, String frequency) {
		super();
		this.bitrate = bitrate;
		this.frequency = frequency;
	}

	public AudioMedia() {
		// TODO Auto-generated constructor stub
	}

	public int getBitrate() {
		return bitrate;
	}

	public void setBitrate(int bitrate) {
		this.bitrate = bitrate;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public void printTitle() {
		System.out.println("AudioMedia Title");
	}

	@Override
	public String toString() {
		return "AudioMedia [bitrate=" + bitrate + ", frequency=" + frequency + "]";
	}
	
}