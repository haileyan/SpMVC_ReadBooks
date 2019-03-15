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
body {
margin-top: 200px;

}

form{
	margin: 0 auto;
	width: 80%;
}

label {
	display:inline-block;
	float:left;
	padding:5px;
	font-weight:bold;
	width:100px;
}

input, textarea{
	display:inline-block;
	width:85%;
	padding:5px;
	margin:5px;
}

button{
	margin-left:600px;
}
</style>
<body>
<section>
	<form action="<c:url value="/insert"/>" method="POST" class="write_form">
	
	<label for="b_userid">사용자ID</label>	
	<input value="${POST.b_userid}" type="text" name="b_userid"><br/>

	<label for="b_isbn">도서코드</label>	
	<input value="${POST.b_isbn}" type="text" name="b_isbn"><br/>
	
	<label for="b_title">도서제목</label>	
	<input value="${POST.b_title}" type="text" name="b_title"><br/>
	
	<label for="b_date">독서일자</label>	
	<input value="${POST.b_date}" type="date" name="b_date"><br/>
	
	<label for="b_star">별점</label>	
	<input value="${POST.b_star}" type="text" name="b_star"><br/>
	
	<label for="b_text">도서록</label>	
	<textarea rows="10" id="b_text" name="b_text">${POST.b_text}</textarea><br/>

	<label></label>
	<button>저장하기</button>
	</form>

</section>
</body>
</html>