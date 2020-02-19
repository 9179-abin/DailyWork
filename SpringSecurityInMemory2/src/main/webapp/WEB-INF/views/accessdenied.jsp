<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Access is denied</title>
</head>
<body>
	<h1>Access is denied</h1>
	<c:choose><c:when test="${empty username}">You are not authorized to access this</h2></c:when>
	<c:otherwise>
		<h2>User name : ${username}</br>
		You do not have access for this page</h2>
	</c:otherwise>
	</c:choose>
</body>
</html>