<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>更新分类 - 智游客户关系管理系统</title>
<link rel="stylesheet" href="<c:url value="/lib/font-awesome/css/font-awesome.css" />">
<link rel="stylesheet" href="<c:url value="/css/main.css" />">
</head>
<body>
	<div class="box">
		<h3>更新分类</h3>
		<form action="<c:url value="/customerCategory/update" />" method="post">
			<table class="form-table">
				<tr>
					<td>分类名称</td>
					<td colspan="3" class="control">
						<input type="text" name="customerCategoryName" value="${ customerCategory.customerCategoryName }" placeholder="填写分类名称">
					</td>
				</tr>
				<tr>
					<td>分类描述</td>
					<td colspan="3" class="control">
						<textarea class="p100" name="customerCategoryDesc" placeholder="请填写分类描述">${ customerCategory.customerCategoryDesc }</textarea>
					</td>
				</tr>
			</table>
			<div class="buttons">
				<input type="hidden" name="customerCategoryId" value="${ customerCategory.customerCategoryId }">
				<input class="btn btn-primary va-bottom" type="submit" value="保存">&nbsp;&nbsp;
				<a class="btn btn-default" href="javascript:history.go(-1)">返回</a>
			</div>
		</form>
	</div>
</body>
</html>