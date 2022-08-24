package com.team150.controller;

import java.util.HashMap;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.team150.domain.MemberVO;
import com.team150.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Inject
	private MemberService memberService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	
	//회원가입 페이지 이동
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String join () throws Exception {
		logger.info("회원가입 페이지 이동");
		return "/member/join";
	}
	
	//회원가입 등록 처리 POST
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String register (MemberVO memverVO, Model model) throws Exception {
		logger.info("회원가입 등록 처리");
		
		return "";
	}
	
	// TODO 아이디 중복 체크 Ajax 호출
	//회원가입 아이디 중복 체크m
	@RequestMapping(value="/idDuplicateCheck", method=RequestMethod.POST)
	@ResponseBody
	public Object idDuplicateCheck (@RequestBody MemberVO memberVO) throws Exception {
		logger.info("회원가입 시 아이디 중복확인");
		HashMap<String, Object> map =  new HashMap<String, Object>();
		String msg = "";
		if(memberService.idDuplicateCheck(memberVO)) {
			msg = "possible";
			
		} else {
			msg = "impossible";
		}
		map.put("msg", msg);
		return map;
	}
	
}
