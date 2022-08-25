package com.cloud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloud.repository.BoardDAO;
import com.cloud.repository.BoardVO;
@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardDAO dao;		//BoardDAO를 주입받아 객체 생성
	
	@Override
	public void insertBoard(BoardVO vo) {	//글쓰기
		dao.insertBoard(vo);
	}
	
	@Override
	public List<BoardVO> getBoardList() {	//목록 보기 서비스
		return dao.getBoardList();
	}



}
