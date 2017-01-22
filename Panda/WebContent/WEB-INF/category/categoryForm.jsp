<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div align = "center">
		<form name = "categoryForm" action = "category.cg"method ="post">
			<input type = "hidden" name ="Command" value ="insetCategory">
			<div>
				카테고리 이름 : <input type ="text" name = "category_name">
			</div>
				<input type = "submit" value ="입력">
		</form>
	</div>
</body>
</html>