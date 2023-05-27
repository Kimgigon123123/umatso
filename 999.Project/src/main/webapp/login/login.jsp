<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인화면</h1>
	<form action="../.login?id=id&pw=pw">
	<label>아이디</label>
	<input type="text" id="id" name="id" placeholder="id를 입력하세요">
	<br>
	<label>비밀번호</label>
	<input type="text" id="pw" name="pw" placeholder="pw를 입력하세요">
	<br>
	<input type="submit" value="로그인">
	</form>
</body>
</html>