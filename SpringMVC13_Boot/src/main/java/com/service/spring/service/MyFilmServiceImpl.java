package com.service.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.service.spring.dao.MyFilmDAO;
import com.service.spring.domain.MyFilm;

public class MyFilmServiceImpl implements MyFilmService {

	@Autowired
	private MyFilmDAO myFilmDAO;
	
	@Override
	public List<MyFilm> findFilmByName(String name) throws Exception {
		// TODO Auto-generated method stub
		return myFilmDAO.findFilmByName(name);
	}

	@Override
	public List<MyFilm> findFilmByScore(int score) throws Exception {
		// TODO Auto-generated method stub
		return myFilmDAO.findFilmByScore(score);
	}

	@Override
	public List<MyFilm> findFilms() throws Exception {
		// TODO Auto-generated method stub
		return myFilmDAO.findFilms();
	}
	

}
