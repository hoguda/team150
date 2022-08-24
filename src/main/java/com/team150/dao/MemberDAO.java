package com.team150.dao;

import com.team150.domain.MemberVO;

public interface MemberDAO {

	//회원가입시 아이디 중복 체크
	public int idDuplicateCheck(MemberVO memverVO) throws Exception;
	
}
