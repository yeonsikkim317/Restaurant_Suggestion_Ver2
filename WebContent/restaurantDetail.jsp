<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html> 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>restaurant 개별 정보 화면</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://www.w3schools.com/lib/w3-theme-black.css">
</head>

<body>
<header class="w3-container w3-theme w3-padding" id="myHeader">
  <i onclick="w3_open()" class="fa fa-bars w3-xlarge w3-button w3-theme"></i> 
  <div class="w3-center">
  <h1 class="w3-xxxlarge w3-animate-bottom">Food Suggestion</h1>
  </div>
</header>
<br><br><br>
<center>

${sessionScope.successMsg}

<h3>restaurant 개별 정보</h3>
<hr><p> 
 
<table border="1">
	<tr>
		<th>ID</th><th>Name</th><th>Pagelink</th>	
	</tr>  
 	<tr>
 		<td>${sessionScope.restaurant.rid}</td>
 		<td>${sessionScope.restaurant.rname}</td>
 		<td>${sessionScope.restaurant.pagelink}</td>
 	</tr>
</table>

<br><br><br>

<a href="total?command=restaurantgetAll">모든 음식점 보기</a>

</center>
</body>
</html>







