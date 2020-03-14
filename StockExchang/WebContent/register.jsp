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
<pre>
<form name="frm" method="POST" action="login.jsp">
Username  |:<input type="text" name="name" /><br>
Password  |:<input type="password" name="pass" /><br>
Email     |:<input type="text" name="email" /><br>
<input type="submit" value="create">
</form>
</pre>


</body>
</html>