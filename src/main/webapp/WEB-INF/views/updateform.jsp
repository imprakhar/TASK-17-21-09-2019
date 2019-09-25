<%@page isELIgnored="false" %>
<html>
<body>
<h3>Update Book</h3>
<form action="update">
<pre>
			Book Id	    	<input type="text" name="bookid" readonly="readonly" value="${bookinfo.getBookid() }"/><br>
			Book Name	<input type="text" name="bname" value="${bookinfo.getBname() }"/><br>
			Author	    	<input type="text" name="bauthor" value="${bookinfo.getBauthor() }"/><br>
			Price       	<input type="text" name="price" value="${bookinfo.getPrice() }"/><br>
			Subject     	<input type="text" name="subject" value="${bookinfo.getSubject() }"/><br>
				<input type="submit" value="Update Book"/><br>
</pre>
</form>
</body>
</html>