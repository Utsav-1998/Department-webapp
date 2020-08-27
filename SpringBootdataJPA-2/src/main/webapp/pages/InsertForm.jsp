<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri ="http://www.springframework.org/tags/form" prefix= "form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel ="Stylesheet"
	href = "https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	
</head>
<body>
	<div class= "container pt-3">
	<form:form  action = "saveForm" modelAttribute= "dept">
		<div class = "form-group">
			<label for = "dname">Department Name</label>
			<form:input path="dname" class="form-control"/>
		
		</div>
	<div class = "form-group">
		<label for = "loc">Location:</label>
		<form:input path="loc" class="form-control"/>
	</div>
	<div class = "form-group">
		<label for = "loc">Budget</label>
		<form:input path="budget" class="form-control"/>
	</div>
	<button type="submit" class ="btn btn-success">Submit</button>
		</form:form>
		</div>
		
		
</body>
</html>