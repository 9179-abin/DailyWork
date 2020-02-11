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


<table border = 1>
<tr>
<th>Id</th>
<th>Company name</th>
<th>Stock Exchange</th>
<th>Price Share</th>
<th>No of Shares</th>
<th>Address</th>
<th>City</th>
<th>State</th>
<th>Pincode</th>
<th>Date</th>
</tr>
<c:forEach var ="user" items="${ipoview}">
<tr>
<td>${user.id}</td>
<td>${user.companyName}</td>
<td>${user.stockExchange}</td>
<td>${user.priceShare}</td>
<td>${user.noOfShares}</td>
<td>${user.address}</td>
<td>${user.city}</td>
<td>${user.state}</td>
<td>${user.pincode}</td>
<td>${user.date}</td>
</tr>
</c:forEach>
</table>


</body>
</html>
