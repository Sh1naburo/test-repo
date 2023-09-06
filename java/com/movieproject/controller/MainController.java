package com.movieproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.movieproject.domain.Criteria;
import com.movieproject.domain.ReviewVO;
import com.movieproject.service.MainService;
import com.movieproject.service.ReviewService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Controller
@RequestMapping("/movieproject/*") // localhost/movieproject/
//@AllArgsConstructor
@Log4j2
public class MainController {

	private MainService service; // db와 Mapper 연동하여 객체 생성

	@GetMapping("/get") // http://localhost/movieproject/get?moviei=1
	public void get(@RequestParam("movie_id") int movie_id, Model model) {

		log.info("/get or modify 메서드 실행...... 조회번호 : " + movie_id);
		model.addAttribute("movie", service.get(movie_id));
	}

}
