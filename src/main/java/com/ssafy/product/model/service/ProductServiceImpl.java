package com.ssafy.product.model.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ssafy.product.model.ProductDto;
import com.ssafy.product.model.dao.ProductDAO;

@Service
public class ProductServiceImpl implements ProductService {

	private final ProductDAO productDao; 
	
	public ProductServiceImpl(ProductDAO productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public List<ProductDto> list() throws Exception {
		return productDao.list();
	}

	@Override
	public boolean regist(ProductDto productDto) throws Exception {
		boolean check = productDao.regist(productDto);
		return check;
	}

}
