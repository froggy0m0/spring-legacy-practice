package com.ssafy.board.model.mapper;

import java.sql.SQLException;
import java.util.ArrayList;

import com.ssafy.board.model.BoardDto;

public interface BoardMapper {

	ArrayList<BoardDto> list() throws SQLException;

	boolean regist(BoardDto boardDto) throws SQLException;

}
