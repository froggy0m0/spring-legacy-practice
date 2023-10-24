<%@ page language="java" contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 목록</title>
</head>
<body>
<table>
<c:forEach var="product" items="${prodcutList}">
	<tr>
		<td>"${product.productCode}"</td>
		<td>"${product.productName}"</td>
		<td>"${product.count}"</td>
	</tr>
</c:forEach>

 <table>
            <thead>
              <tr>
                <th>코드</th>
                <th>이름</th>
                <th>수량</th>
              </tr>
            </thead>
            <tbody>    
				<c:forEach var="product" items="${productList}">    
	              <tr class="text-center">
	                <td>${product.productCode}</td>
	                <td>${product.productName}</td>
	                <td>${product.count}</td>
	              </tr>            
				</c:forEach>   
            </tbody>
          </table>
</table>
</table>
</body>
</html>