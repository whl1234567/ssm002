<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录 - 智游客户关系管理系统</title>
<link rel="stylesheet" href='<c:url value="/css/index.css" />' >
</head>
<body>
	<div class="login">
        <img src="<c:url value="/image/logo.png" />" alt="智游">
        <p>智游客户关系管理系统</p>
        <form action='<c:url value="user/login.action" />' method="post">
            <div>
                <input type="text" id="username" name="username" value="" placeholder="请输入用户名">
            </div>
            <div>
                <input type="password" id="password" name="password" value="" placeholder="请输入密码">
            </div>
            <div>
            	<p class="error-message"></p>
                <input type="submit" value="登录">
            </div>
        </form>
    </div>
    <script>
    	if (window.top !== window) {
    		window.top.location.reload();
    	}
    </script>
</body>
</html>