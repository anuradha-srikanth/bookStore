<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" />
</head>
<body>
<div class="container">
<div class="links"> 
	<h1> <a href="list"> Book Store </a></h1>
	<h2> <a href="new"> Add New Book </a></h1>
</div>

<form name="book_form" action="insert" method="post">
<caption> <h2> New Book Form </h2></caption>
	<p> <label> Book Title: </label></p><br/>
		<input type="text" name="title" value=""></input>
	<br/>
	<p> <label> Author </label></p><br/>
		<input type="text" name="author" value=""></input>
	<br/>
	<p> <label> Price </label></p><br/>
		<input type="text" name="price" value=""></input>
	<br/>
	<input type="submit" value="Submit"/>
</form>
</div>


</body>
</html>