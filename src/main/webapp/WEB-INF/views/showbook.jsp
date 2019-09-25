<%@ page isELIgnored="false"%>
<html>
<body>
	<hr>
	<pre>
		Book Id :${bookinfo.getBookid()} 
		Book Name :${bookinfo.getBname()} 
		Author :${bookinfo.getBauthor()} 
		Price :${bookinfo.getPrice()}
		Subject :${bookinfo.getSubject()}
	<hr>
	</pre>
	<a href="viewbook">Search Another Book</a>
	<a href="index.jsp">Home</a>
</body>
</html>