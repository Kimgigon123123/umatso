<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원가입</h1>
	<form action="../create.member?id=id&pw=pw&name=name">
	<label>아이디</label>
	<input type="text" id="id" name="id" placeholder="id를 입력하세요">
	<br>
	<label>비밀번호</label>
	<input type="text" id="pw" name="pw" placeholder="pw를 입력하세요">
	<br>
	<label>이름</label>
	<input type="text" id="name" name="name" placeholder="이름을 입력하세요">
	<br>
	<input type="submit" value="회원가입">
</body>
</html>