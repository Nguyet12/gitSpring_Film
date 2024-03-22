package com.service.spring.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.service.spring.domain.MyFilm;

public class MyFilmDAOImpl implements MyFilmDAO{

	@Autowired
	private SqlSession sqlSession;
	private final static String NS="MyFilmMapper.";
	@Override
	public List<MyFilm> findFilmByScore(int score) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(NS+"findFilmByScore",score);
	}

	@Override
	public List<MyFilm> findFilmByName(String name) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(NS+"findFilmeByName",name);
	}

	@Override
	public List<MyFilm> findFilms() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(NS+"findDilms");
	}

}
