<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>The Ultimate Pokemon Database - Trainer Edition</title>
<meta <%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix= "c" %>>
<link rel="stylesheet" href="site.css">
</head>
<body>
	<div>
		<img src="headerimg.png"></img>
		<h1 align="center">Gym Leader Database</h1>
		<a class="btn" href="./home">Back to menu</a>
	</div>
	<table style="margin: 1em auto;">
		<tr>
			<th>Image</th>
			<th>ID</th>
			<th>Name</th>
			<th>Gender</th>
			<th>Type</th>
			<th>Hometown</th>
			<th>Region</th>
			<th>Badge</th>
			<th>Badge Image</th>
		</tr>
		<c:forEach items="${allG}" var="c">
			<tr>
				<td><img src="imgG/${c.getG_ID()}.png"></img></td>
				<td>${c.getG_ID()}</td>
				<td>${c.getG_Name()}</td>
				<td>${c.getG_Gender()}</td>
				<td>${c.getG_Type()}</td>
				<td>${c.getG_Hometown()}</td>
				<td>${c.getG_Region()}</td>
				<td>${c.getG_Badge()}</td>
				<td><img src="imgBadge/${c.getG_ID()}.png"></img></td>

			</tr>
		</c:forEach>
	</table>
</body>
</html>