<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="<c:url value=''/>" method="POST" autocomplete="off">
<legend>Login</legend>

<label>ID</label>
<input type="text" placeholder="아이디를 입력하세요" id="b_userid" name="b_userid"></input>

<label>Password</label>
<input type="password" placeholder="비밀번호를 입력하세요" id="b_password" name="b_password"></input>

<button type="button" id="btn_login">로그인</button>
</form>
</body>
</html>