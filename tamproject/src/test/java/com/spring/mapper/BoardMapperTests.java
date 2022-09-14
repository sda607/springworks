package com.spring.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.domain.BoardVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	
	@Autowired
	private BoardMapper boardMapper;
	
	@Test
	public void testGetList() {
		log.info("----------------");
		log.info(boardMapper.getList());
	}
	
	@Test
	public void testInsert() {
		BoardVO vo = new BoardVO();
		vo.setTitle("test Å×½ºÆ®");
		vo.setContent("test ÄÜÅÙÃ÷");
		vo.setWriter("tester");
		
		boardMapper.insert(vo);
	}
	
	@Test
	public void testRead() {
		BoardVO vo = boardMapper.read(4L);
		log.info(vo);
	}
	
	@Test
	public void testDelete() {
		int count = boardMapper.delete(4L);
		
		log.info("count" + count);
	}
	
	@Test
	public void testUpdate() {
		BoardVO vo = new BoardVO();
		vo.setBno(1L);
		vo.setTitle("updated Title");
		vo.setContent("updated content");
		vo.setWriter("update user00");
		
		log.info("count" + boardMapper.update(vo));
	}
}