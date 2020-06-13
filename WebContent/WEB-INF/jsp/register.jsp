<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册页面</title>
</head>
<body>
    ${msg}
	<form action="toregister" method="post">
		用户名：<input type="text" name="name"><br>
		密码：<input type="password" name="password"><br>
		<input type="submit" value="注册">
		<input type="reset" value="重置">
	</form>
</body>
</html>