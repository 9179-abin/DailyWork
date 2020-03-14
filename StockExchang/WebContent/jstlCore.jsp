<%@include file="header.jsp" %>

<%-- <c:set var="name" value="Abin"/>
Name: <c:out value="${name}"/>
<c:remove var="name"/>
<br />
Name: <c:out value="${name}"/>
<br />
Loop: <br />
<c:forEach var="i" items="1,2,4,5,6,3,8,22,5,6,7,8">
<h2>${i}</h2>
</c:forEach> --%>
<%-- <c:catch var ="catchException">
         <% int x = 5/0;%>
      </c:catch>

      <c:if test = "${catchException != null}">
         <p>The exception is : ${catchException} <br />
         There is an exception: ${catchException.message}</p>
      </c:if> --%>
      <c:import var = "data" url = "http://www.tutorialspoint.com"/>
      <c:out value = "${data}"/>
</body>
</html>