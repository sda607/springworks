package com.spring.mapper;

import java.util.List;

import com.spring.domain.MemberVO;

public interface MemberMapper {

	
	public List<MemberVO> getMemberList();
	
	public void insertMember(MemberVO member);
	
	public MemberVO read(String userid);
	
	public void deleteMember(MemberVO member);
	
	public void updateMember(MemberVO member);
}
