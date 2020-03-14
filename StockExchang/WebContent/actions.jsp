<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="header.jsp" %>
</head>
<body>
<jsp:useBean id="user" class="com.cts.training.bean.LoginBean" scope="page">
</jsp:useBean>
<%-- <jsp:setProperty property="username" name="user" value="admin"/>
<jsp:setProperty property="password" name="user" value="admin#1234"/> --%>

<jsp:setProperty property="*" name="user"/>
<hr>
User details are:<br>
Username: <jsp:getProperty property="username" name="user"/><br>

Password: <jsp:getProperty property="password" name="user"/>
</body>
</html>