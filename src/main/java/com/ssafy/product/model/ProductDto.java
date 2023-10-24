package com.ssafy.product.model;

public class ProductDto {
	private String productCode;
	private String productName;
	private int count;
	
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "ProductDto [productCode=" + productCode + ", productName=" + productName + ", count=" + count + "]";
	}
}
