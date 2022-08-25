package com.cloud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloud.repository.BoardDAO;
import com.cloud.repository.BoardVO;
@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardDAO dao;		//BoardDAO�� ���Թ޾� ��ü ����
	
	@Override
	public void insertBoard(BoardVO vo) {	//�۾���
		dao.insertBoard(vo);
	}
	
	@Override
	public List<BoardVO> getBoardList() {	//��� ���� ����
		return dao.getBoardList();
	}



}
