package com.ssafy.board.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssafy.board.model.BoardDto;
import com.ssafy.board.model.service.BoardService;
import com.ssafy.user.model.UserDto;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	private final BoardService boardService;
	
	public BoardController(BoardService boardService) {
		super();
		this.boardService = boardService;
	}

	@GetMapping("/list")
	public String list(Model model) throws Exception {
		ArrayList<BoardDto> boardList = boardService.list();
		
		model.addAttribute("boardList", boardList);
		return "/board/list";
	}
	
	@GetMapping("regist")
	public String registFrom() throws Exception {
		return "/board/regist";
	}
	
	@PostMapping("regist")
	public String regist(BoardDto boardDto, Model model, HttpSession session) throws Exception {
		UserDto userInfo = (UserDto)session.getAttribute("userInfo");
		if(userInfo == null) {
			model.addAttribute("msg", "게시글 등록오류 - 로그인이필요합니다");
			model.addAttribute("url", "/");
			return "/common/alert";
		}
		boardDto.setUserId(userInfo.getUserId());
		
		if(boardService.regist(boardDto) == false) {
			model.addAttribute("msg", "게시글 등록오류 - 정삭적인 등록을해주세요");
			model.addAttribute("url", "/");
			return "/common/alert";
		}
		
		return "redirect:/board/list";
	}
}
