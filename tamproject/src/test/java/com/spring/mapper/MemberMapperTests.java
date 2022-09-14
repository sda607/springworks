package com.spring.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.domain.MemberVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MemberMapperTests {
	
	@Autowired
	private MemberMapper memberMapper;
	
	@Test
	public void testGetMemberList() {
		log.info("----------------");
		log.info(memberMapper.getMemberList());
	}

	
	@Test
	public void testRead() {
		MemberVO vo = memberMapper.read("tom123");
		log.info(vo);
	}
	
	
	  @Test public void testDelete() { MemberVO vo = new MemberVO();
	  vo.setUserid("tom123");
	  
	  memberMapper.deleteMember(vo);
	  
	  }
	  @Test
	  public void testUpdate() {
		  MemberVO vo = new MemberVO();
			 vo.setUserid("sky123");
			 vo.setUsername("À±¹ÌÇý");
			 vo.setUserpw("1234");
			 vo.setEmail("cloud@naver.com");
			 vo.setGender("¿©");
			  
			 memberMapper.updateMember(vo); 
	  }




}