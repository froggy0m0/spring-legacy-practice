<%@ page language="java" contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>게시판 목록</title>
</head>
<body>
	<h2>게시판 목록</h2>
	<p>asd</p>
	<c:if test="${not empty boardList}">
		<tr>
			<td>게시글 번호</td>
			<td>제목</td>
			<td>아이디</td>
			<td>조회수</td>
			<td>등록일</td>
		</tr>
		<hr>
		<c:forEach var="board" items="${boardList}">
			<tr>
				<td>${board.idx}</td>
				<td><a href="/board/view/${board.subject}">${board.subject}</a></td>
				<td>${board.userId}</td>
				<td>${board.hit}</td>
				<td>${board.registDate}</td>
			</tr>
			<hr>
		</c:forEach>
	</c:if>
	
	<a href="/board/regist">게시판 등록</a>
</body>
</html>