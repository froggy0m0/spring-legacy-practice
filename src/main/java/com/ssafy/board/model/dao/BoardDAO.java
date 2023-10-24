package com.ssafy.board.model.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.ssafy.board.model.BoardDto;

public interface BoardDAO {

	ArrayList<BoardDto> list() throws SQLException;

	boolean regist(BoardDto boardDto) throws SQLException;

}
