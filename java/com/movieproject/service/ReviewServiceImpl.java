package com.movieproject.service;

import java.util.List;

import com.movieproject.domain.ReviewVO;
import com.movieproject.mapper.ReviewMapper;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ReviewServiceImpl implements ReviewService {

	private ReviewMapper mapper; // 필드 > 생성자 자동처리

	@Override
	public List<ReviewVO> getList() {

		log.info("getList() 메서드 실행........");

		return mapper.getReview(); // mapper서비스의 리스트 출력용
	} // 인터페이스의 구현 클래스로 동작

	@Override
	public void register(ReviewVO review) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ReviewVO get(int movie_id) {

		log.info("get메서드 실행()....." + movie_id);
		
		return mapper.read(movie_id); // mapper에 있는 read 메서드 실행 후 BoardVO 리턴
	}

	@Override
	public boolean modify(ReviewVO review) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(int movie_id) {
		// TODO Auto-generated method stub
		return false;
	}
}
