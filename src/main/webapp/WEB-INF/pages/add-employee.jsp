<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC Form Handling</title>
</head>

<body>
	<h2>Employee</h2>
	<form:form method="POST" action="addEmployee" modelAttribute="employee">
		Id: <form:input path="id" />
		<br/>
		Name: <form:input path="name" />
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>
