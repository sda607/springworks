package com.cloud.service;

import java.util.List;

import com.cloud.repository.BoardVO;

public interface BoardService {

	public void insertBoard(BoardVO vo);	//글쓰기 (추가)
	
	public List<BoardVO> getBoardList();	//목록 보기
	

}
