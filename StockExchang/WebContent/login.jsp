<%@page import="java.sql.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="header.jsp" %>
<title>Insert title here</title>
</head>
<%
String name=request.getParameter("name");
String password=request.getParameter("pass");
%>
<body>
<pre>
<form name="frm1" method="POST" action="login.jsp?name=<%=name%>&pass=<%=password%>">
Username  |:<input type="text" name="name1" /><br>
Password  |:<input type="password" name="pass1" /><br>
<input type="submit" value="login">
</form>
</pre>
<%
String name1=request.getParameter("name1");
String password1=request.getParameter("pass1");
if(name.equals(name1) && password.equals(password1)){
	response.sendRedirect("home.jsp?name='"+name+"'");
}
%>
</body>
</html>