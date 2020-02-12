<%@page isELIgnored = "false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<%@include file="header.jsp" %>
</head>
<body>
<h2>Hello World!</h2>
<hr>
${message}
<hr>
<%-- <ol>
<c:forEach var = "name" items="${list}">
<li><h3>${name}</h3></li>
</c:forEach>
</ol> --%>

<%-- <div class="container">
<div class="text-center text-light bg-dark"><h1>User List</h1></div>
<table class="table table-dark text-white">
<tr>
<th>Id</th>
<th>Email</th>
<th>Enabled</th>
<th>Password1</th>
<th>Password2</th>
<th>Phone</th>
<th>Username</th>
</tr>
<c:forEach var ="user" items="${list}">
<tr>
<td>${user.id}</td>
<td>${user.email}</td>
<td>${user.enabled}</td>
<td>${user.password1}</td>
<td>${user.password2}</td>
<td>${user.phone}</td>
<td>${user.username}</td>
</tr>
</c:forEach>
</table>
</div>
 --%>
</body>
</html>
