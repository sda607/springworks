package com.cloud.service;

import java.util.List;

import com.cloud.repository.BoardVO;

public interface BoardService {

	public void insertBoard(BoardVO vo);	//�۾��� (�߰�)
	
	public List<BoardVO> getBoardList();	//��� ����
	

}
