package com.team150.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String join () throws Exception {
		logger.info("회원가입 페이지 이동");
		return "/member/join";
	}
	
	
}
