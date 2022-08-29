package com.cloud.mapper;

import java.util.List;

import com.cloud.domain.BoardVO;

public interface BoardMapper {

	public List<BoardVO> getBoardList();	//�� ��� ����
	
	public void insertBoard(BoardVO vo);	//�۾���
	
	public BoardVO getBoard(int bno);		//�� �� ����
	
	public void deleteBoard(BoardVO vo);	//�� ����
	}
