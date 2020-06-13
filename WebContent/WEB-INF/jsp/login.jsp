<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录页面</title>
</head>
<body>
    ${msg}
	<form action="tologin" method="post">
		用户名：<input type="text" name="name" /><br>
		密&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="password" name="password" /><br>
		<input type="submit" value="登录">
		<input type="reset" value="重置">
	</form>
	<br>
	如果还没注册，请前往注册
	<form action="initregister" method="post">
		<input type="submit" value="注册">
	</form>
</body>
</html>