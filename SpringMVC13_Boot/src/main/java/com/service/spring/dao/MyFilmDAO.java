package com.service.spring.dao;

import java.util.List;

import com.service.spring.domain.MyFilm;

public interface MyFilmDAO {
	List<MyFilm> findFilmByScore(int score) throws Exception;
	List<MyFilm> findFilmByName(String name) throws Exception;
	List<MyFilm> findFilms() throws Exception;
}
