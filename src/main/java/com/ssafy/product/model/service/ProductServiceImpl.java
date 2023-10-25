package com.ssafy.product.model.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ssafy.product.model.ProductDto;
import com.ssafy.product.model.mapper.ProductMapper;

@Service
public class ProductServiceImpl implements ProductService {

	private final ProductMapper productMapper; 
	
	public ProductServiceImpl(ProductMapper productMapper) {
		super();
		this.productMapper = productMapper;
	}

	@Override
	public List<ProductDto> list() throws Exception {
		return productMapper.list();
	}

	@Override
	public boolean regist(ProductDto productDto) throws Exception {
		boolean check = productMapper.regist(productDto);
		return check;
	}

}
