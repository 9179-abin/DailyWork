<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page isELIgnored="false"%>
<meta charset="ISO-8859-1">
<title>Add User</title>
<%@include file="header.jsp"%>
<br>
<div class="row">
<div class="container">
	<div class="row m-4">
		<div class="col" style="height: 70vh;">
			<div class="card shadow">
				<p class="h4 card-header text-center">Add IPO</p>
				<div class="card-body bg-light">

					<p class="card-text">Details:&nbsp;</p>
					<c:url var="ipoUrl" value="/ipo/saveipo" />
					<form:form action="${ipoUrl}" modelAttribute="ipo">
					
						<c:if test="${!empty ipo.companyName}">
						<div class="input-group mt-3 mb-3 form-group">
							<div class="input-group-prepend">
							
								<form:label class="input-group-text" path="id">Company Id</form:label>
							</div>
							<form:input type="text" class="form-control" path="id" readonly="true" disabled="true"></form:input>
						</div></c:if>
						
						
						<div class="input-group mt-3 mb-3 form-group">
							<div class="input-group-prepend">
								<form:label class="input-group-text" path="companyName">Company Name</form:label>
							</div>
							<form:input type="text" class="form-control" path="companyName"></form:input>
						</div>
						<div class="input-group mb-3 form-group">
							<div class="input-group-prepend">
								<form:label class="input-group-text" path="stockExchange">Stock Exchange:</form:label>
							</div>
							<form:input type="text" class="form-control" path="stockExchange"></form:input>
						</div>

						<div class="input-group mb-3 form-group">
							<div class="input-group-prepend">
								<form:label class="input-group-text" path="priceShare">Price of Share:</form:label>
							</div>
							<form:input type="text" class="form-control" path="priceShare"></form:input>
						</div>
						
						<div class="input-group mb-3 form-group">
							<div class="input-group-prepend">
								<form:label class="input-group-text" path="noOfShares">No. of Shares:</form:label>
							</div>
							<form:input type="text" class="form-control" path="noOfShares"></form:input>
						</div>

						<div class="input-group mb-3 form-group">
							<div class="input-group-prepend">
								<form:label class="input-group-text" path="city">City:</form:label>
							</div>
							<form:input type="text" class="form-control" path="city"></form:input>
						</div>
						<div class="input-group mb-3 form-group">
							<div class="input-group-prepend">
								<form:label class="input-group-text" path="state">State:</form:label>
							</div>
							<form:input type="text" class="form-control" path="state"></form:input>
						</div>
						<div class="input-group mb-3 form-group">
							<div class="input-group-prepend">
								<form:label class="input-group-text" path="address">Address:</form:label>
							</div>
							<form:input type="text" class="form-control" path="address"></form:input>
						</div>
						<div class="input-group mb-3 form-group">
							<div class="input-group-prepend">
								<form:label class="input-group-text" path="pincode">Pincode:</form:label>
							</div>
							<form:input type="number" class="form-control" path="pincode"></form:input>
						</div>
						<div class="row justify-content-center">
							<c:if test="${empty ipo.companyName}">
							<button type="submit" class="btn btn-success ">Add IPO</button></c:if>
							<c:if test="${!empty ipo.companyName}">
							<button type="submit" class="btn btn-success ">Update IPO</button></c:if>
							<button type="reset" class="btn btn-danger ml-2 ">Reset</button>
						</div>
					</form:form>
				</div>
			</div>

		</div>
	</div>
</div>
</div>
<br>
<br>
<br>
<br>
<br>
<br>
<div class="row">
<div class="container">
<div class="text-center text-light bg-dark"><h1>IPO List</h1></div>
<table class="table table-dark text-white">
<tr>
<th>Id</th>
<th>Company Name</th>
<th>Stock Exchange</th>
<th>Share of Price</th>
<th>No. of Shares</th>
<th>Address</th>
<th>city</th>
<th>State</th>
<th>Pincode</th>
<th>Date</th>
<th>Actions</th>
</tr>
<c:forEach var ="user" items="${ipoview}">
<tr>
<td>${user.id}</td>
<td>${user.companyName}</td>
<td>${user.stockExchange }</td>
<td>${user.priceShare}</td>
<td>${user.noOfShares}</td>
<td>${user.address }</td>
<td>${user.city}</td>
<td>${user.state}</td>
<td>${user.pincode}</td>
<td>${user.date}</td>
<td><a href="<c:url value='/removeipo/${user.id}' />">Remove</a></td>
<td><a href="<c:url value='/updateipo/${user.id}' />">Update</a></td>
</tr>
</c:forEach>
</table>
</div>
</div>
</body>
</html>