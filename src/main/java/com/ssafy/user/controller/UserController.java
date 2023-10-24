package com.ssafy.user.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssafy.user.model.UserDto;
import com.ssafy.user.model.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {

	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@PostMapping("/login")
	private String login(UserDto userDto,Model model, HttpSession session) throws Exception {
		
		boolean check = userService.login(userDto);
		System.out.println(check);
		if(check==false) {
			model.addAttribute("msg", "로그인실패!");
			model.addAttribute("url", "/");
			return "/common/alert";
		}
		
		session.setAttribute("userInfo", userDto);
		
		return "index";
	}
	
	@GetMapping("/logout")
	private String logout(HttpSession session) {
		session.invalidate();
		
		return "redirect:/";
	}
	
}
