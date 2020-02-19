<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page isELIgnored="false"%>
<meta charset="ISO-8859-1">
<title>Manage User</title>
<%@include file="header.jsp"%>
<br>

<div class="row">
<div class="container">
	<div class="row m-4">
		<div class="col" style="height: 70vh;">
			<div class="card shadow">
				<p class="h4 card-header text-center">Add User</p>
				<div class="card-body bg-light">

					<p class="card-text">Details:&nbsp;</p>
					<c:url var="userUrl" value="/user/saveuser" />
					<form:form action="${userUrl}" modelAttribute="user">
						<c:if test="${!empty user.username}">
						<div class="input-group mt-3 mb-3 form-group">
							<div class="input-group-prepend">
								<form:label class="input-group-text" path="id">Id</form:label>
							</div>
							<form:input class="form-control" path="id"></form:input>
						</div>
						</c:if>
						<div class="input-group mt-3 mb-3 form-group">
							<div class="input-group-prepend">
								<form:label class="input-group-text" path="username">Username</form:label>
							</div>
							<form:input type="text" class="form-control" path="username"></form:input>
						</div>
						<div class="input-group mt-3 mb-3 form-group">
							<div class="input-group-prepend">
								<form:label class="input-group-text" path="fname">First name</form:label>
							</div>
							<form:input type="text" class="form-control" path="fname"></form:input>
						</div>
						<div class="input-group mt-3 mb-3 form-group">
							<div class="input-group-prepend">
								<form:label class="input-group-text" path="lname">Last name</form:label>
							</div>
							<form:input type="text" class="form-control" path="lname"></form:input>
						</div>
						<div class="input-group mb-3 form-group">
							<div class="input-group-prepend">
								<form:label class="input-group-text" path="password1">Password</form:label>
							</div>
							<form:input type="password" class="form-control" path="password"></form:input>
						</div>

						<div class="input-group mb-3 form-group">
							<div class="input-group-prepend">
								<form:label class="input-group-text" path="email">Email</form:label>
							</div>
							<form:input type="email" class="form-control" path="email"></form:input>
						</div>

						<div class="input-group mb-3 form-group">
							<div class="input-group-prepend">
								<form:label class="input-group-text" path="phone">Mobile</form:label>
							</div>
							<form:input type="number" class="form-control" path="phone"></form:input>
						</div>
						<div class="input-group mb-3 form-group">
							<div class="input-group-prepend">
								<form:label class="input-group-text" path="address">Address</form:label>
							</div>
							<form:textarea class="form-control" path="address"></form:textarea>
						</div>
						<div class="row justify-content-center">
							<c:if test="${empty user.username}">
							<button type="submit" class="btn btn-success ">Add User</button></c:if>
							<c:if test="${!empty user.username}">
							<button type="submit" class="btn btn-success ">Update User</button></c:if>
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
		<h1>User List</h1>
	</div>
	<table class="table table-dark text-white">
		<tr>
			<th>Id</th>
		    <th>Username</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Password</th>
			<th>Address</th>
			<th>Phone</th>
			<th>Enabled</th>
			<th>Actions</th>
		</tr>
		<c:forEach var="user" items="${list}">
			<tr>
				<td>${user.id}</td>
				<td>${user.username}</td>
				<td>${user.fname}</td>
				<td>${user.lname}</td>				
				<td>${user.email}</td>
				<td>${user.password}</td>
				<td>${user.address}</td>
				<td>${user.phone}</td>
				<td>${user.enabled}</td>
				<td><a href="<c:url value='/removeuser/${user.id}' />">Remove</a></td>
				<td><a href="<c:url value='/updateuser/${user.id}' />">Update</a></td>
				<td><a href="<c:url value='/activateuser/${user.id}' />">Activate</a></td>
			</tr>
		</c:forEach>
	</table>
</div>
</div>


</body>
</html>