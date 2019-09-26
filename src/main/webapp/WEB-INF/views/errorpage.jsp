<%@taglib uri="http://www.springframework.org/tags/form" prefix="fr" %>

<html>
<body>
	<h3>Error-Page</h3>
	<hr>
		<h3>All Errors</h3>
		<fr:errors path="book.*"/>
	<hr>
		
</body>
</html>