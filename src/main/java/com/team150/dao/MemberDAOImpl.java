package com.team150.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.team150.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static String namespace = "com.team150.mappers.member";
	
	//회원가입시 아이디 중복 체크
	@Override
	public int idDuplicateCheck(MemberVO memberVO) throws Exception {
		return sqlSession.selectOne(namespace + ".idDuplicateCheck");
	}

}
