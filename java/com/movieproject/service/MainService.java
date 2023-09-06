package com.movieproject.service;

import java.util.List;

import com.movieproject.domain.Criteria;
import com.movieproject.domain.MovieVO;
import com.movieproject.mapper.MainMapper;

public interface MainService {

	public MovieVO get(int movie_id); // 번호를 이용하여 게시물 가져옴


}