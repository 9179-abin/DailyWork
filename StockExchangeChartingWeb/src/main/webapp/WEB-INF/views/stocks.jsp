<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<meta charset="ISO-8859-1">
<title>Add User</title>
<%@include file="header.jsp"%>
<br>


<%-- <c:url var="userUrl" value="/users/save" />
 <form:form action="${userUrl}" modelAttribute="user">
	<table>
		<tr>
			<td><form:label path="username">Username:</form:label></td>
			<td><form:input path="username"></form:input></td>
		</tr>
		<tr>
			<td><form:label path="password1">Password:</form:label></td>
			<td><form:input path="password1"></form:input></td>
		</tr>
		<tr>
			<td><form:label path="password2">Re-enter Password:</form:label></td>
			<td><form:input path="password2"></form:input></td>
		</tr>
		<tr>
			<td><form:label path="email">Email:</form:label></td>
			<td><form:input path="email"></form:input></td>
		</tr>
		<tr>
			<td><form:label path="phone">Phone:</form:label></td>
			<td><form:input  path="phone"></form:input></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Register"></td>
		
		</tr>
	</table>
</form:form> --%>

<div class="row">
	<div class="container">
		<div class="row m-4">
			<div class="col" style="height: 70vh;">
				<div class="card shadow">
					<p class="h4 card-header text-center">Manage Stocks</p>
					<div class="card-body bg-light">

						<p class="card-text">Details:&nbsp;</p>
						<c:url var="stockUrl" value="/stocks/savestocks" />
						<form:form action="${stockUrl}" modelAttribute="stock">
							<c:if test="${!empty stock.stockExchanges}">
								<div class="input-group mt-3 mb-3 form-group">
									<div class="input-group-prepend">
										<form:label class="input-group-text" path="id">Id</form:label>
									</div>
									<form:input class="form-control" path="id"></form:input>
								</div>
							</c:if>
							<div class="input-group mt-3 mb-3 form-group">
								<div class="input-group-prepend">
									<form:label class="input-group-text" path="stockExchanges">Stock Exchange</form:label>
								</div>
								<form:input type="text" class="form-control" path="stockExchanges"></form:input>
							</div>
							<div class="input-group mb-3 form-group">
								<div class="input-group-prepend">
									<form:label class="input-group-text" path="aboutSE">About SE</form:label>
								</div>
								<form:input type="text" class="form-control" path="aboutSE"></form:input>
							</div>


							<div class="input-group mb-3 form-group">
								<div class="input-group-prepend">
									<form:label class="input-group-text" path="address">Address</form:label>
								</div>
								<form:input type="text" class="form-control" path="address"></form:input>
							</div>
							<div class="row justify-content-center">
								<c:if test="${empty stock.stockExchanges}">
									<button type="submit" class="btn btn-success ">Add
										Stocks</button>
								</c:if>
								<c:if test="${!empty stock.stockExchanges}">
									<button type="submit" class="btn btn-success ">Update
										Stocks</button>
								</c:if>
								<button type="reset" class="btn btn-danger ml-2 ">Reset</button>
							</div>
						</form:form>
					</div>
				</div>

			</div>
		</div>
	</div>
</div>


<div class="row">
	<div class="container">
		<div class="text-center text-light bg-dark">
			<h1>Stock Exchange List</h1>
		</div>
		<table class="table table-dark text-white">
			<tr>
				<th>Id</th>
				<th>Stock Exchanges</th>
				<th>About SE</th>
				<th>Address</th>
				<th>Actions</th>
			</tr>
			<c:forEach var="user" items="${stocksview}">
				<tr>
					<td>${user.id}</td>
					<td>${user.stockExchanges}</td>
					<td>${user.aboutSE}</td>
					<td>${user.address}</td>
					<td><a href="<c:url value='/removestocks/${user.id}' />">Remove</a></td>
					<td><a href="<c:url value='/updatestocks/${user.id}' />">Update</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</div>

</body>
</html>