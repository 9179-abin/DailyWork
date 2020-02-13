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
				<p class="h4 card-header text-center">Sector</p>
				<div class="card-body bg-light">

					<p class="card-text">Details:&nbsp;</p>
					<c:url var="sectorUrl" value="/sector/savesector" />
					<form:form action="${sectorUrl}" modelAttribute="sector">
						<c:if test="${!empty sector.Sector}">
						<div class="input-group mt-3 mb-3 form-group">
							<div class="input-group-prepend">
								<form:label class="input-group-text" path="id">Id</form:label>
							</div>
							<form:input class="form-control" path="id"></form:input>
						</div>
						</c:if>
						<div class="input-group mt-3 mb-3 form-group">
							<div class="input-group-prepend">
								<form:label class="input-group-text" path="Sector">Sector</form:label>
							</div>
							<form:input type="text" class="form-control" path="Sector"></form:input>
						</div>
						<div class="input-group mb-3 form-group">
							<div class="input-group-prepend">
								<form:label class="input-group-text" path="Brief">Brief</form:label>
							</div>
							<form:input type="password" class="form-control" path="Brief"></form:input>
						</div>

						<div class="row justify-content-center">
							<c:if test="${empty sector.Sector}">
							<button type="submit" class="btn btn-success ">Add Sector</button></c:if>
							<c:if test="${!empty sector.Sector}">
							<button type="submit" class="btn btn-success ">Update Sector</button></c:if>
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
			<th>Email</th>
			<th>Enabled</th>
			<th>Password1</th>
			<th>Password2</th>
			<th>Phone</th>
			<th>Username</th>
			<th>Actions</th>
		</tr>
		<c:forEach var="user" items="${sectorview}">
			<tr>
				<td>${user.id}</td>
				<td>${user.Sector}</td>
				<td>${user.Brief}</td>
				<td><a href="<c:url value='/removesector/${user.id}' />">Remove</a></td>
				<td><a href="<c:url value='/updatesector/${user.id}' />">Update</a></td>
			</tr>
		</c:forEach>
	</table>
</div>
</div>



</body>
</html>