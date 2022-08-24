package com.team150.service;

import com.team150.domain.MemberVO;

public interface MemberService {

	//회원가입시 아이디 중복 체크
	public boolean idDuplicateCheck(MemberVO memverVO) throws Exception;
	
}
