package com.ssafy.product.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.ssafy.product.model.ProductDto;

@Repository
public class ProductDAOImpl implements ProductDAO {

	private final DataSource ds;
	
	public ProductDAOImpl(DataSource ds) {
		super();
		this.ds = ds;
	}

	@Override
	public List<ProductDto> list() throws SQLException {
		List<ProductDto> productList = new ArrayList<ProductDto>();
		try(
			Connection conn = ds.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(""
					+ "select * from product ");
			) {
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ProductDto productDto = new ProductDto();
				productDto.setProductCode(rs.getString("product_code"));
				productDto.setProductName(rs.getString("product_name"));
				productDto.setCount((rs.getInt("count")));
				
				productList.add(productDto);
			}
		}
		return productList;
	}

	@Override
	public boolean regist(ProductDto productDto) throws SQLException {
		int check = 0;
		try(
				Connection conn = ds.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(""
						+ " insert into product "
						+ "values (?, ?, ?) ");
			){
			int index = 1;
			pstmt.setString(index++, productDto.getProductCode());
			pstmt.setString(index++, productDto.getProductName());
			pstmt.setInt(index++, productDto.getCount());
			
			check = pstmt.executeUpdate();
		}
		
		return check == 1 ? true : false;
	}

}
