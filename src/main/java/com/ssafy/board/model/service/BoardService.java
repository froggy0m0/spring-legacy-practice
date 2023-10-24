package com.ssafy.board.model.service;

import java.util.ArrayList;

import com.ssafy.board.model.BoardDto;

public interface BoardService {

	ArrayList<BoardDto> list() throws Exception;

	boolean regist(BoardDto boardDto) throws Exception;

}
