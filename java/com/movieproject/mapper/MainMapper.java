package com.movieproject.mapper;

import java.util.List;

import com.movieproject.domain.Criteria;
import com.movieproject.domain.MovieVO;
import com.movieproject.domain.ReviewVO;

public interface MainMapper {

//	@Select("select * from tbl_board where bno > 0") -> 간단한 검색은 가능 -> xml맵퍼로 등록

	public MovieVO read(int movie_id); // 번호를 이용하여 게시물 찾기

}