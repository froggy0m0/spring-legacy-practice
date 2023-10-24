package com.ssafy.product.model.dao;

import java.sql.SQLException;
import java.util.List;

import com.ssafy.product.model.ProductDto;

public interface ProductDAO {

	List<ProductDto> list() throws SQLException;

	boolean regist(ProductDto productDto) throws SQLException;

}
