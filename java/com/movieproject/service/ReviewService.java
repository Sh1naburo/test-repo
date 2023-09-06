package com.movieproject.service;

import java.util.List;

import com.movieproject.domain.ReviewVO;

public interface ReviewService {

//	domain이라는 곳은 데이터베이스 테이블의 객체를 담당
//	Service라는 곳은 데이터베이스의 테이블 여러개를 섞어 구현하는 곳

	public void register(ReviewVO review); // 게시물 등록

	public ReviewVO get(int movie_id); // 번호를 이용하여 게시물 가져옴

	public boolean modify(ReviewVO review); // 게시물 수정 > t/f

	public boolean remove(int movie_id); //

	public List<ReviewVO> getList();
}
