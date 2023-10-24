package com.ssafy.board.model.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.ssafy.board.model.BoardDto;
import com.ssafy.board.model.dao.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService {

	private final BoardDAO boardDao;
	
	public BoardServiceImpl(BoardDAO boardDao) {
		super();
		this.boardDao = boardDao;
	}

	@Override
	public ArrayList<BoardDto> list() throws Exception {
		return boardDao.list();
		
	}

	@Override
	public boolean regist(BoardDto boardDto) throws Exception {
		return boardDao.regist(boardDto);
	}

}
