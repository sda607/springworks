package com.spring.service;

import java.util.List;

import com.spring.domain.BoardVO;

public interface BoardService {

	void register(BoardVO board);
	
	BoardVO get(Long bno);
	
	int modify(BoardVO board);
	
	int remove(Long bno);
	
	List<BoardVO> getList();
}
