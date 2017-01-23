<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>join</title>
</head>
<body>
	<section id="join_section">	
		<div id="join_form">
			<form action="member/joinProcess.jsp">
			<table>
				<tr>
					<td>회원가입</td>
					<td><input type="hidden" name="point" id="point"></td>
				</tr>
				<tr>
					<td>아이디</td>
					<td><input type="text" name="id" id="id"></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" name="pw" id="pw"></td>
				</tr>
				<tr>
					<td>비밀번호 확인</td>
					<td><input type="password" name="pwCheck" id="pwCheck"></td>
				</tr>
				<tr>
					<td>성명</td>
					<td><input type="text" name="name" id="name"></td>
				</tr>
				<tr>
					<td>휴대폰</td>
					<td><input type="text" name="phone" id="phone"></td>
				</tr>
				<tr>
					<td>주소</td>
					<td><input type="text" name="address" id="address"></td>
				</tr>
				<tr>
					<td><input type="submit"></td>
				</tr>
			</table>
			</form>
		</div>
	</section>
</body>
</html>