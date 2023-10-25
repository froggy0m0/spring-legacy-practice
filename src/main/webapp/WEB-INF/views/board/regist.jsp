<%@ page language="java" contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>게시판 등록</title>
</head>
<body>
	<h2>게시판 등록</h2>
	<form action="/board/regist" method="post">
		제목 : <input type="text" name="subject"> </br>
		내용 : <input type="textarea" name="content"> </br>
		<button type="submit">등록</button>
	</form>
</body>
</html>