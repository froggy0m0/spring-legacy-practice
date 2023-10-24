package com.ssafy.product.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssafy.product.model.ProductDto;
import com.ssafy.product.model.service.ProductService;
import com.ssafy.user.model.UserDto;

@Controller
@RequestMapping("/product")
public class ProductController {
	private final ProductService productService;

	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	
	@GetMapping("/list")
	public String list(Model model) throws Exception {
		
		List<ProductDto> productList = productService.list();
		
		if(productList != null) {
			model.addAttribute("productList", productList);
		}
		
		return "/product/list";
	}
	
	@GetMapping("/regist")
	public String registForm(HttpSession seesion, Model model) throws Exception {
		UserDto userInfo = (UserDto)seesion.getAttribute("userInfo");
		if(userInfo == null) {
			model.addAttribute("msg", "등록실패");
			model.addAttribute("url", "/product/list");
			return "/common/alert";
		}
		return "/product/regist";
	}
	
	@PostMapping("/regist")
	public String regist(ProductDto productDto, Model model) throws Exception {
		if(productDto.getProductName().equals("") || productDto.getProductName() == null
				|| productDto.getProductCode().equals("") || productDto.getProductCode() == null 
				|| productDto.getCount() == 0) {
			model.addAttribute("msg", "올바른 정보입력하세요");
			model.addAttribute("url", "/product/regist");
			return "/common/alert";
		}
		if(productService.regist(productDto) == false) {
			model.addAttribute("msg", "올바른 정보를 입력하세요");
			model.addAttribute("url", "/product/regist");
		}else {
			model.addAttribute("msg", "등록성공");
			model.addAttribute("url", "/product/list");
		}
		return "/common/alert";
	}
}
