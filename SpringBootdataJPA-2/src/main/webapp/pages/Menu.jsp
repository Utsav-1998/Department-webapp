<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri ="http://java.sun.com/jsp/jstl/core" prefix =" c" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel ="Stylesheet"
	href = "https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>

<br>
${msg }

 <h2>Menu Items</h2>
<a href = "/insertForm" class = "btn btn-primary">Insert Departments</a>
&nbsp;&nbsp;&nbsp;
<a href = "/showByName" class = "btn btn-primary">Show By name</a>
&nbsp;&nbsp;&nbsp;
<a href = "/deleteByName" class = "btn btn-primary">Delete By name</a>
&nbsp;&nbsp;&nbsp;
<a href = "/orderedList" class = "btn btn-primary">Order By budget</a>
&nbsp;&nbsp;&nbsp;
<a href = "/getBudget" class = "btn btn-primary">Show by budget</a><br><br>


<c:if test = "${list.size() > 0 }">
<center><h2>Department List</h2></center>
<table class = "table table-bordered  table-striped">
<tr>
<th>ID</th>
<th>Department Name</th>
<th>Location</th>
<th>Budget</th>
</tr>
<c:forEach  var ="dep" items ="${list}">
<tr>
<td>${dep.deptno}</td>
<td>${dep.dname}</td>
<td>${dep.loc }</td>
<td>${dep.budget }</td>

</tr>
</c:forEach>
</table>
</c:if>


</body>
</html>