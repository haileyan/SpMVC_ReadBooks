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
<style>
body{
margin-top:200px;

}

table {
	border-collapse:collapse;
	border-spacing:0;
	width:90%;
	border:1px solid #ccc;
	margin-left:100px;
}

tr{
	border: 1px solid #ddd;
}

tr:nth-child(even) {
	background-color: #ccc;
}

tr:nth-child(odd) {
	background-color: #fff;
}

tr:hover {
	background-color: #ddd;
}

td {
	text-align:center;
}

td, th {
padding : 8px 8px;
vertical-align : top; 

}
</style>
<body>
<table>
	<tr>
		<th>사용자ID</th>
		<th>도서코드</th>
		<th>도서제목</th>
		<th>독서일자</th>
		<th>별점</th>
	</tr>
	<c:choose>
		<c:when test="${empty POSTS}">
			<tr>
			<td colspan="4">리스트가 없습니다</td>
			</tr>
		</c:when>	
		<c:otherwise>
			<c:forEach items="${POSTS}" var="posts" varStatus="i">
				<tr>
				<td>${posts.b_userid}</td>
				<td>${posts.b_isbn}</td>
				<td>${posts.b_title}</td>
				<td>${posts.b_date}</td>
				<td>${posts.b_star}</td>
				</tr>
			</c:forEach>
		</c:otherwise>
	</c:choose>
</table>	
</body>
</html>