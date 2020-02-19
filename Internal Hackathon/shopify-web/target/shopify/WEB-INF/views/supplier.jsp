<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page isELIgnored="false"%>
<meta charset="ISO-8859-1">
<title>Manage Supplier</title>
<%@include file="header.jsp"%>
<br>

<div class="row">
<div class="container">
	<div class="row m-4">
		<div class="col" style="height: 70vh;">
			<div class="card shadow">
				<p class="h4 card-header text-center">Add Supplier</p>
				<div class="card-body bg-light">

					<p class="card-text">Details:&nbsp;</p>
					<c:url var="supplierUrl" value="/supplier/savesupplier" />
					<form:form action="${supplierUrl}" modelAttribute="#">
						<div class="input-group mt-3 mb-3 form-group">
							<div class="input-group-prepend">
								<form:label class="input-group-text" path="suppliername">Supplier name</form:label>
							</div>
							<form:input type="text" class="form-control" path="suppliername"></form:input>
						</div>
						<div class="input-group mb-3 form-group">
							<div class="input-group-prepend">
								<form:label class="input-group-text" path="contact">Contact</form:label>
							</div>
							<form:input type="number" class="form-control" path="contact"></form:input>
						</div>

						<div class="input-group mb-3 form-group">
							<div class="input-group-prepend">
								<form:label class="input-group-text" path="address">Address</form:label>
							</div>
							<form:textarea class="form-control" path="address"></form:textarea>
						</div>
						<div class="row justify-content-center">
							<button type="submit" class="btn btn-success ">Add Supplier</button>
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
			<th>Supplier Name</th>
			<th>Contact</th>
			<th>Address</th>
			<th>Actions</th>
		</tr>
		<c:forEach var="#" items="">
			<tr>
				<td>"</td>
				<td>"</td>
				<td>"</td>
				<td>"</td>
				<td><a href="<c:url value='/removesupplier/#' />">Remove</a></td>
				<td><a href="<c:url value='/updatesupplier/#' />">Update</a></td>
			</tr>
		</c:forEach>
	</table>
</div>
</div>

</body>
</html>