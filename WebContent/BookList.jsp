<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.util.*" %>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% ArrayList<String> books = (ArrayList)request.getAttribute("books"); %>

<%-- Book Title: ${book_title} --%>
<%-- <c:forEach items="${books}" var="item">
	<p> Book: ${item} </p>
</c:forEach> --%>

<% for (String s:books){%>
	Book: <%= s %> <br />
<% } %>
</body>
</html>