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

<table border = 1>
<tr>
<th>Id</th>
<th>About Company</th>
<th>city</th>
<th>Company Name</th>
<th>Pincode</th>
<th>Sector</th>
<th>State</th>
<th>Stock Exchange</th>
<th>Turnover</th>
</tr>
<c:forEach var ="user" items="${companyview}">
<tr>
<td>${user.id}</td>
<td>${user.aboutCompany}</td>
<td>${user.city}</td>
<td>${user.companyName}</td>
<td>${user.pincode}</td>
<td>${user.sector}</td>
<td>${user.state}</td>
<td>${user.stockExchange}</td>
<td>${user.turnover}</td>
</tr>
</c:forEach>
</table>


</body>
</html>
