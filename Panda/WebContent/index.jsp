<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>메인 홈</title>
</head>
<body>
<!-- header/nav/footer 미희추가 0123 -->
<%@ include file="/common/header.jsp" %>
<%@ include file="/common/nav.jsp" %>
<section id="main_section">
<!-- nav 영역에 카테고리 판 다음 옮기  -->
	<a href ="category.cg?Command=insertCategoryForm">카테고리 생성</a><br>
	<a href ="category.cg?Command=insertCategoryDown">하위 카테고리 생성</a>
</section>
<%@ include file="/common/footer.jsp" %>
</body>
</html>