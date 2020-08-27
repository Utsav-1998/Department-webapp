<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri ="http://java.sun.com/jsp/jstl/core " prefix ="c" %>
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
<form action="byname">
Enter Department name:<input type="text" name ="txtDname">
<input type ="submit"></form>
<h2>Department List</h2>
<table class="table table-bordered table-striped">
<tr>
<th>ID</th>
<th>Department Name</th>
<th>Location</th>
<th>budget</th>
</tr>
<c:forEach var="dep"items="${list }">
<tr>
<td>${dep.deptno }</td>
<td>${dep.dname }</td>
<td>${dep.loc }</td>
<td>${dep.budget }</td>
</tr>
</c:forEach>
</table>
</body>
</html>