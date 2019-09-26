<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<html>
<body>
	<h3>Book-Entry-Form</h3>
		<form:form action="addbook1" modelAttribute="book">
		<pre>
		Book Id		<form:input path="bookid"/>	<form:errors path="bookid"/>
		Book Name	<form:input path="bname"/>	<form:errors path="bname"/>
		Author		<form:input path="bauthor"/> <form:errors path="bauthor"/>
		Price		<form:input path="price"/>  <form:errors path="price"/>
		Subject		<form:input path="subject"/>	<form:errors path="subject"/>
			<input type="submit" value="Save Book"/>
		</pre>
	
	</form:form>
		<a href="index.jsp">Home</a><br>
		<a href="showall">List of Books</a>
</body>
</html>