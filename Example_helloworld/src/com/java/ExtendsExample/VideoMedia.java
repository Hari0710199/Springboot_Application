package com.java.ExtendsExample;

public class VideoMedia extends Media {

	private String resolution;
	private String aspectRatio;

	public VideoMedia(String resolution, String aspectRatio) {
	
		this.resolution = resolution;
		this.aspectRatio = aspectRatio;
	}

	public VideoMedia() {
		
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public String getAspectRatio() {
		return aspectRatio;
	}

	public void setAspectRatio(String aspectRatio) {
		this.aspectRatio = aspectRatio;
	}

	@Override
	public String toString() {
		return "VideoMedia [resolution=" + resolution + ", aspectRatio=" + aspectRatio + "]";
	}

}