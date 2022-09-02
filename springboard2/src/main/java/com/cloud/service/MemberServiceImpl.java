package com.cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.cloud.domain.AuthVO;
import com.cloud.domain.MemberVO;
import com.cloud.mapper.MemberAuthMapper;
import com.cloud.mapper.MemberMapper;

@Service
public class MemberServiceImpl  implements MemberService{

	@Autowired
	private MemberMapper mapper;
	
	@Autowired
	private MemberAuthMapper authMapper;
	
	@Autowired
	private PasswordEncoder pwencoder;
	
	@Override
	public void signup(MemberVO member) {
		//��й�ȣ ��ȣȭ
		String encPw = pwencoder.encode(member.getUserpw());
		member.setUserpw(encPw);
		
		mapper.insertMember(member);	//member ����
		
		AuthVO auth = new AuthVO();
		auth.setUserid(member.getUserid());
		auth.setAuth("ROLE_USER");		//���� ���� ó��
		
		authMapper.insertMemberAuth(auth);//auth �ο�
		
	}

}