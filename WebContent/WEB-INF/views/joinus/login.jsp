<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<main>
<h2>로그인</h2>
<c:if test="${msg}">
${msg}
</c:if>
<div style="color:red;">
</div>
	<form method="post">
		<label>아이디:</label>
		<input name="mid"/>
		<label>비밀번호:</label>
		<input name="pwd"/>
		<input type="submit" value="로그인"/>
	</form>
</main>