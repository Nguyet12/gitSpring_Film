package com.service.spring.service;

import java.util.List;

import com.service.spring.domain.MyFilm;

public interface MyFilmService {
	List<MyFilm> findFilmByName(String name) throws Exception;
	List<MyFilm> findFilmByScore(int score) throws Exception;
	List<MyFilm> findFilms() throws Exception;
	

}
