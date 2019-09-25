<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h3>List-of-Books</h3>
<hr>
	<table border="2">
	
	<tr>
		<th>Book ID</th><th>Book Name</th><th>Author</th><th>Price</th><th>Subject</th><th>Delete</th><th>Update</th>
	<tr>
	<c:forEach var="book" items="${book}">
		<tr>
			<td>${book.bookid}</td>
			<td>${book.bname}</td>
			<td>${book.bauthor}</td>
			<td>${book.price}</td>
			<td>${book.subject}</td>
			<td><a href="removebook?id=${book.bookid}">[Delete]</a></td>
			<td><a href="updatebook?id=${book.bookid}">Update</a></td>
		</tr>
	</c:forEach>
	</table>
	<a href="index.jsp">Home</a><br>
    <a href="addbook">Add a Book</a>

<hr>
</body>
</html>