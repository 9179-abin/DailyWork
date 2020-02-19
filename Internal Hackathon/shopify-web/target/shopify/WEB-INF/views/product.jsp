<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html> --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page isELIgnored="false"%>
<meta charset="ISO-8859-1">
<title>Manage Product</title>
<%@include file="header.jsp"%>
<br>
<div class="row">
<div class="container">
	<div class="row m-4">
		<div class="col" style="height: 70vh;">
			<div class="card shadow">
				<p class="h4 card-header text-center">Add Product</p>
				<div class="card-body bg-light">
					<p class="card-text">Details:&nbsp;</p>
					<c:url var="userUrl" value="/users/save" />
					<form:form action="${#}" modelAttribute="">
						<div class="input-group mt-3 mb-3 form-group">
							<div class="input-group-prepend">
								<form:label class="input-group-text" path="productid">Product id</form:label>
							</div>
							<form:input type="text" class="form-control" path="productid"></form:input>
						</div>
						<div class="input-group mb-3 form-group">
							<div class="input-group-prepend">
								<form:label class="input-group-text" path="productname">Product name</form:label>
							</div>
							<form:input type="text" class="form-control" path="contact"></form:input>
						</div>
						<div class="input-group mb-3 form-group">
							<div class="input-group-prepend">
								<form:label class="input-group-text" path="price">Price</form:label>
							</div>
							<form:input type="text" class="form-control" path="price"></form:input>
						</div>
						<div class="input-group mb-3 form-group">
							<div class="input-group-prepend">
								<form:label class="input-group-text" path="stock">Stock</form:label>
							</div>
							<form:input type="text" class="form-control" path="stock"></form:input>
						</div>
						<div class="input-group mb-3 form-group">
							<div class="input-group-prepend">
								<form:label class="input-group-text" path="supplier">Supplier</form:label>
							</div>
							<form:input type="text" class="form-control" path="supplier"></form:input>
						</div>
						<div class="input-group mb-3 form-group">
							<div class="input-group-prepend">
								<form:label class="input-group-text" path="description">Description</form:label>
							</div>
							<form:textarea class="form-control" path="description"></form:textarea>
						</div>
						<div class="row justify-content-center">
							<button type="submit" class="btn btn-success ">Add Product</button>
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
			<th>Product Name</th>
			<th>price</th>
			<th>Stock</th>
			<th>Supplier</th>
			<th>Description</th>
		</tr>
		<c:forEach var="#" items="${#}">
			<tr>
				<td>${product.id}</td>
				<td>${product.name}</td>
				<td>${product.price}</td>
				<td>${product.stock}</td>
				<td>${product.supplier}</td>
				<td>${product.description}</td>
				<td><a href="<c:url value='/removesupplier/${#.id}' />">Remove</a></td>
				<td><a href="<c:url value='/updatesupplier/${#.id}' />">Update</a></td>
			</tr>
		</c:forEach>
	</table>
</div>
</div>
</body>
</html>