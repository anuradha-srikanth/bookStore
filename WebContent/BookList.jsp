<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.util.*" %>
<%@ page import ="com.pluralsight.Book" %>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"></link>
</head>
<body>

<% ArrayList<Book> bookList = (ArrayList<Book>)request.getAttribute("bookList"); %>

<div class="container"> 
<div class="links"> 
	<h1> <a href="list"> Book Store </a></h1>
	<h2> <a href="new"> Add New Book </a></h1>
</div>
<table>
	<tr> 
		<th> Title </th>
		<th> Author </th>
		<th> Price </th>
	</tr>
	
<% for (Book b:bookList){%>
	<tr> 
		<td> <%=b.getTitle() %></td>
		<td> <%=b.getAuthor() %> </td>
		<td> <%=b.getPrice() %> </td>
	</tr>
<%}%>
</table>

</div>
</body>
</html>