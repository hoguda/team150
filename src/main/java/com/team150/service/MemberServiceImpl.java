package com.team150.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.team150.dao.MemberDAO;
import com.team150.domain.MemberVO;


@Service
public class MemberServiceImpl implements MemberService {
	
	@Inject
	private MemberDAO memberDAO;

	//회원가입시 아이디 중복 체크
	@Override
	public boolean idDuplicateCheck(MemberVO memverVO) throws Exception {
		
		boolean check = false;
		
		int result = memberDAO.idDuplicateCheck(memverVO);
		
		if (result > 0) {
			check = true;
		}
		
		return check;
	}

}
