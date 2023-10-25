package com.ssafy.board.model.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.ssafy.board.model.BoardDto;
import com.ssafy.board.model.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {

	private final BoardMapper boardMapper;
	
	public BoardServiceImpl(BoardMapper boardMapper) {
		super();
		this.boardMapper = boardMapper;
	}

	@Override
	public ArrayList<BoardDto> list() throws Exception {
		return boardMapper.list();
		
	}

	@Override
	public boolean regist(BoardDto boardDto) throws Exception {
		return boardMapper.regist(boardDto);
	}

}
