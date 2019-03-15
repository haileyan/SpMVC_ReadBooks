<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="UTF-8">
<title>나만의 독서록</title>
</head>
<style>
*{
	box-sizing:border-box;
}

body{
	padding: 0;
	margin: 0;
}

header{
	position:fixed;
	width:100%;
	top:0;
	background-color:#F4FA58;
	padding:30px;
}

nav {
	display: flex;
	align-items: flex-end;
	justify-content: space-between;
	transition:align-items 0.2s;
}

.logo {
	display: inline-block;
	padding:20px 30px;
	background-color: #F35B66;
	color:#fff;
	margin:50px 50px 0 50px;
	transition: all 0.2s;
	
}

ul {
	display: flex;
	margin:50px 50px 0 0;
	padding:0;
	list-style-type : none;
}

li a {
	display: block;
	padding: 10px 20px;
	text-decoration: none;
	color:#0B0B61;
}

li a:hover {
	background-color: #E6E6E6;
}


</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<body>
<%@ include file="/WEB-INF/views/include/main_menu.jspf" %>
<article id="body">

</article>
</body>
</html>