<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 등록</title>
</head>
<body>
	<h3>상품 등록</h3>
	<form action="/product/regist" method="post"> 
		상품 코드 : <input type="text" name="productCode"> <br>
		상품 명 : <input type="text" name="productName"> <br>
		수량 : <input type="int" name="count">  <br>
		<button type="submit">등록</button>
	</form>
	
</body>
</html>