package com.ssafy.product.model.service;

import java.util.List;

import com.ssafy.product.model.ProductDto;

public interface ProductService {

	List<ProductDto> list() throws Exception;

	boolean regist(ProductDto productDto) throws Exception;
}
