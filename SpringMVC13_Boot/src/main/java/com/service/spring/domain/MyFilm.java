package com.service.spring.domain;

public class MyFilm {
	private int filmId;
	private String filmName;
	private int score;
	private String pictureUrl;
	private String description;
	
	public MyFilm() {}
	
	public MyFilm(int filmId, String filmName, int score, String pictureUrl, String description) {
		super();
		this.filmId = filmId;
		this.filmName = filmName;
		this.score = score;
		this.pictureUrl = pictureUrl;
		this.description = description;
	}

	public int getFilmId() {
		return filmId;
	}

	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}

	public String getFilmName() {
		return filmName;
	}

	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getPictureUrl() {
		return pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	

}
