<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>The Ultimate Pokemon Database</title>

<meta <%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix= "c" %>>
<link rel="stylesheet" href="site.css">
</head>
<body>
	<h1>All Pokemon</h1>
	<table>
		<tr>
			<th>Image</th>	
			<th>ID</th>
			<th>Name</th>
			<th>Primary Type</th>
			<th>Secondary Type</th>
			<th>Total</th>
			<th>HP</th>
			<th>Attack</th>
			<th>Defense</th>
			<th>Special Attack</th>
			<th>Special Defense</th>
			<th>Speed</th>
			<th>Species</th>
		</tr>
		<c:forEach items="${allP}" var="c">
		<tr>
			<td><img src = "img/${c.getP_id()}.ico"></img></td>
			<td>${c.getP_id()}</td>
			<td>${c.getP_name()}</td>
			<td>${c.getP_ptype()}</td>
			<td>${c.getP_stype()}</td>
			<td>${c.getP_total()}</td>
			<td>${c.getP_hp()}</td>
			<td>${c.getP_attack()}</td>
			<td>${c.getP_defense()}</td>
			<td>${c.getP_sattack()}</td>
			<td>${c.getP_sdefense()}</td>
			<td>${c.getP_speed()}</td>
			<td>${c.getP_species()}</td>
			
		</tr>
		</c:forEach>	
	</table>
</body>
</html>