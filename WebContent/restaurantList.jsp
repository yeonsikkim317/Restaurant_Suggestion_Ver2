<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>모든 음식점 리스트(관리자 version)</title>
<script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://www.w3schools.com/lib/w3-theme-black.css">
</head>

<body>
	<header class="w3-container w3-theme w3-padding" id="myHeader">
	<i onclick="w3_open()" class="fa fa-bars w3-xlarge w3-button w3-theme"></i>
	<div class="w3-center">
		<h1 class="w3-xxxlarge w3-animate-bottom">Restaurants near
			Playdata</h1>

	</div>
	</header>
	
	<br>
	<br>
	<br>
	<center>
		<div id="ListTable">
			<h3>모든 restaurant 리스트</h3>

			<hr>
			<p>
			<table border="1">
				<tr>
					<th>No</th>
					<th>Name</th>
					<th>Update</th>
					<th>Delete</th>
				</tr>

				<%-- <c:forEach begin="10" end="20" step="2" var="data" varStatus="status"> --%>
				<c:forEach var="data" items="${sessionScope.restaurantAll}"
					varStatus="status">
					<tr>
						<td>${status.count}</td>
						<td>${data.rname}</td>
						<td><button
								onclick="location.href='total?command=restaurantUpdateReq&rid=${data.rid}'">수정하기</button>
						</td>
						<td><button
								onclick="location.href='total?command=restaurantDelete&rid=${data.rid}'">삭제하기</button>
						</td>

					</tr>
				</c:forEach>

			</table>
			<br> <br> <br> <a href="javascript:void(0);"
				onclick="req()">음식점 추가</a> &nbsp;&nbsp;&nbsp;<a href="total">메인
				화면 이동</a> <br> <br> <br>
		</div>
	</center>
	<script type="text/javascript">
				function req() {
					axios.get('restaurantInsert.jsp', {
					})
						.then(response => {
							console.log(response.data); 
							document.getElementById("ListTable").innerHTML
								= response.data;
						})
						.catch(error => {
							console.log(error);
						});
				};
	</script>
</body>

</html>