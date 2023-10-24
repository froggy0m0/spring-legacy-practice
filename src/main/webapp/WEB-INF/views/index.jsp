<%@ page language="java" contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>싸피 샵</title>
</head>
<body>
<h1>
	싸피 샵
</h1>
<%-- <c:choose>

	 <c:when test="${not empty userInfo}">
		<p>"${userInfo.userId}"님 환영합니다</p>
	</c:when>
	
	<c:otherwise>
		<form action="/user/login" method="Post">
			아이디 : <input type ="text" name="userId">
			패스워드 : <input type="password" name="userPassword">
			<button type="submit">로그인!</button>
		</form>
	</c:otherwise>
</c:choose> --%>
	
	
	<c:if test="${not empty sessionScope.userInfo}">
		<p>"${sessionScope.userInfo.userId}"세션입니다..</p>
		<a href="/user/logout">로그아웃</a>
	</c:if>
	
	<c:if test="${empty sessionScope.userInfo}">
		<form action="/user/login" method="Post">
			아이디 : <input type ="text" name="userId">
			패스워드 : <input type="password" name="userPassword">
			<button type="submit">로그인!</button>
		</form>
	</c:if>


<br><br>
</hr>
<a href="/product/list">상품 목록</a> <br>
<a href="/product/regist">상품 등록</a> <br>
</hr>
<a href="/board/list">게시판 목록</a>
</body>
</html>
