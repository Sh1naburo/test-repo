package com.movieproject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.movieproject.domain.Criteria;
import com.movieproject.domain.MovieVO;
import com.movieproject.mapper.MainMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@AllArgsConstructor
@Log4j2
public class MainServiceImpl implements MainService {

	private MainMapper mapper; // 필드 -> 생성자 자동 구현
//
//	@Override
//	public void register(MovieVO movie) {
//		 
//		log.info("register....." + movie); // 매개값으로 받은 board 객체 출력
//		
//		mapper.insertSelectKey(movie); // mapper에서 제공하는 sql처리용 insert 처리
//		
//	}

	@Override
	public MovieVO get(int movie_id) {

		log.info("get메서드 실행()....." + movie_id);
		
		return mapper.read(movie_id); // mapper에 있는 read 메서드 실행 후 BoardVO 리턴

	}
//
//	@Override
//	public boolean modify(MovieVO movie) {
//
//		log.info("modify()메서드 실행....." + movie);
//		
//		return mapper.update(movie) == 1; // 1이면 true
//	}
//
//	@Override
//	public boolean remove(int movie_id) {
//
//		log.info("remove()메서드 실행....." + movie_id);
//		
//		return mapper.delete(movie_id) == 1; // 1이면 true
//	}
//
//	@Override
//	public List<MovieVO> getList() {
//
//		log.info("getList() 메서드 실행........");
//		
//		return mapper.getList(); // mapper서비스의 리스트 출력용
//	}
//	

	
	/*
	 * @Override public int getTotal(Criteria cri){
	 * 
	 * log.info("get total count");
	 * 
	 * return mapper.getTotalCount(cri);
	 * 
	 * }
	 */
	
}
