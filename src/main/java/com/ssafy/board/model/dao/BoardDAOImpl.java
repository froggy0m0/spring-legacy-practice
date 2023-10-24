package com.ssafy.board.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.ssafy.board.model.BoardDto;

@Repository
public class BoardDAOImpl implements BoardDAO {

	private final DataSource ds;

	public BoardDAOImpl(DataSource ds) {
		super();
		this.ds = ds;
	}

	@Override
	public ArrayList<BoardDto> list() throws SQLException {
		ArrayList<BoardDto> boardList = new ArrayList<BoardDto>();

		try (Connection conn = ds.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(
						"select * from board ");
			) {
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				BoardDto boardDto = new BoardDto();
				boardDto.setContent(rs.getString("content"));
				boardDto.setHit(rs.getInt("hit"));
				boardDto.setIdx(rs.getInt("idx"));
				boardDto.setLike(rs.getInt("like"));
				boardDto.setRegistDate(rs.getDate("regist_date"));
				boardDto.setSubject(rs.getString("subject"));
				boardDto.setUserId(rs.getString("user_id"));
				boardList.add(boardDto);
			}
		}
		return boardList;
	}

	@Override
	public boolean regist(BoardDto boardDto) throws SQLException {

		try (Connection conn = ds.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(
						"insert into board(user_id, subject, content) "
						 +"values (?, ?, ?) ");
			) {
			
			int idx = 1;
			pstmt.setString(idx++, boardDto.getUserId());
			pstmt.setString(idx++, boardDto.getSubject());
			pstmt.setString(idx++, boardDto.getContent());

			return pstmt.executeUpdate() == 1 ? true : false;
		}
	}

}
