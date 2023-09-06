package com.movieproject.mapper;

import java.util.List;

import com.movieproject.domain.ReviewVO;

public interface ReviewMapper {

//	@Select("select * from tbl_board where bno > 0") -> 간단한 검색은 가능 -> xml맵퍼로 등록
	public List<ReviewVO> getReview(); // SQL을 이용하여 리스트 반환용
	// where bno > 0 사용 이유는 PK를 이용한 인덱스 처리용
	
	
	
	public void insert(ReviewVO reivew); // board 객체를 이용한 삽입
	
	public void insertSelectKey(ReviewVO reivew); // 객체 삽입 후 bno를 반환
	
	public ReviewVO read(int movie_id); // 번호를 이용하여 게시물 찾기
	
	public int delete(int movie_id); // 번호를 이용해 삭제 후 리턴은 int
	
	public int update(ReviewVO reivew); // 게시물을 수정하는 리턴은 int
}
