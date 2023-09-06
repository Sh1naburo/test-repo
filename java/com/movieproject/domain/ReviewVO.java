package com.movieproject.domain;

import java.sql.Date;

import lombok.Data;

@Data
public class ReviewVO {
	private int reviews_id, member_id, movie_id;
	private String reviews_content;
	private Date creationDate, updatedDate;
	
}
