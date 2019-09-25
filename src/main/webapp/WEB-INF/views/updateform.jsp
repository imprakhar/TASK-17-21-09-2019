<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>

<html>
<body>
	<h3>Book Entry Form</h3>
	<hr>
	<form:form action="update" modelAttribute="book">
		<pre>
		Book Id	<form:input path="bookid"/>	
		Book Name	<form:input path="bname"/>	
		Author	<form:input path="bauthor"/>
		Price	<form:input path="price"/>  
		Subject	<form:input path="subject"/>	
			<input type="submit" value="Update"/>
		</pre>
	
	</form:form>
	<hr>
	
</body>
</html>