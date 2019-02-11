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
<link rel="stylesheet" type="text/css" href="css/style.css"></link>
</head>
<body>

<% ArrayList<Book> bookList = (ArrayList<Book>)request.getAttribute("bookList"); %>

<%-- Book Title: ${book_title} --%>
<%-- <c:forEach items="${books}" var="item">
	<p> Book: ${item} </p>
</c:forEach> --%>
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
</body>
</html>