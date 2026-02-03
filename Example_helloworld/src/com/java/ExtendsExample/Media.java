package com.java.ExtendsExample;

public class Media {

	private int id;
	private String title;
	private String artist;

	public Media(int id, String title, String artist) {
		super();
		this.id = id;
		this.title = title;
		this.artist = artist;
	}

	public Media() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "Media [id=" + id + ", title=" + title + ", artist=" + artist + "]";
	}
	

}