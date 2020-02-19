<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page isELIgnored="false"%>
<meta charset="ISO-8859-1">
<title>User Login</title>
<%@include file="header.jsp"%>
<br>

<div class="row">
<div class="container">
	<div class="row m-4">
		<div class="col" style="height: 70vh;">
			<div class="card shadow">
				<p class="h4 card-header text-center">Login</p>
				<div class="card-body bg-light">

					<p class="card-text">Details:&nbsp;</p>
					<c:url var="userUrl" value="/login" />
					<form:form action="${userUrl}" modelAttribute="">
						<div class="input-group mt-3 mb-3 form-group">
							<div class="input-group-prepend">
								<form:label class="input-group-text" path="username">Username</form:label>
							</div>
							<form:input type="text" class="form-control" path="username"></form:input>
						</div>
						<div class="input-group mb-3 form-group">
							<div class="input-group-prepend">
								<form:label class="input-group-text" path="password">Password</form:label>
							</div>
							<form:input type="password" class="form-control" path="password"></form:input>
						</div>

							<button type="submit" class="btn btn-success ">Login</button>
							<button type="reset" class="btn btn-danger ml-2 ">Reset</button>
						</div>
					</form:form>
				</div>
			</div>

		</div>
	</div>
</div>
</div>

</body>
</html>