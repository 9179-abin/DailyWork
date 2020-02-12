<%@page isELIgnored = "false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<%@include file="header.jsp" %>
</head>
<body>
<hr>

<div class="container">
<div class="text-center text-light bg-dark"><h1>IPO List</h1></div>
<table class="table table-dark text-white">
<tr>
<th>Id</th>
<th>About SE</th>
<th>Address</th>
<th>Stock Exchanges</th>
</tr>
<c:forEach var ="user" items="${stockview}">
<tr>
<td>${user.id}</td>
<td>${user.aboutSE}</td>
<td>${user.address}</td>
<td>${user.stockExchanges}</td>
</tr>
</c:forEach>
</table>
</div>

</body>
</html>
