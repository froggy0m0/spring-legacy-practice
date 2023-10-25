package com.ssafy.product.model.mapper;

import java.sql.SQLException;
import java.util.List;

import com.ssafy.product.model.ProductDto;

public interface ProductMapper {

	List<ProductDto> list() throws SQLException;

	boolean regist(ProductDto productDto) throws SQLException;

}
