<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>The Ultimate Pokemon Database</title>
	<meta <%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix= "c" %>>
	<link rel="stylesheet" href="site.css">
</head>
<body>
	<img src="img/headerimg2.png"></img>
	<h1 align="center">Complete Pokémon Pokédex</h1>
	<a class="btn" href="./home">Back to menu</a>
	<p>Table of every Pokémon from the Pokémon games</p>
	<div>
		<div class="Table-Filter">
			<label for="pkFilter"> Name, ID or Type:</label>
			<input type="text" id="pkInput" class="input-text" placeholder="Search...">
		</div>
		<table id = "pkTable" style="margin: 1em auto;">
			<thead>
				<tr>
					<th style="padding-left: 1em;">Image</th>
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
			</thead>
			<tbody>
				<c:forEach items="${allP}" var="c">
				<tr>
					<td><img src ="imgP/${c.getP_id()}.ico"></img></td>
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
				</c:forEach>
			</tbody>
		</table>
		<button onclick="topFunction()" id="topBtn" title="Go to top">Go to top</button>
	</div>
	<script>
		window.onscroll = function() {
			scrollFunction()
		};

		function scrollFunction() {
			if (document.body.scrollTop > 20
					|| document.documentElement.scrollTop > 20) {
				document.getElementById("topBtn").style.display = "block";
			} else {
				document.getElementById("topBtn").style.display = "none";
			}
		}

		function topFunction() {
			document.body.scrollTop = 0;
			document.documentElement.scrollTop = 0;
		}

		function filterTable(event) {
			var filter = event.target.value.toUpperCase();
			var rows = document.querySelector("#pkTable tbody").rows;

			for (var i = 0; i < rows.length; i++) {
				var firstCol = rows[i].cells[1].textContent.toUpperCase();
				var secondCol = rows[i].cells[2].textContent.toUpperCase();
				var thirdCol = rows[i].cells[3].textContent.toUpperCase();
				
				if (firstCol.indexOf(filter) > -1 || secondCol.indexOf(filter) > -1 || thirdCol.indexOf(filter) > -1) {
					rows[i].style.display = "";
				} else {
					rows[i].style.display = "none";
				}
			}
		}

		document.querySelector('#pkInput').addEventListener('keyup', filterTable, false);
	</script>
</body>
</html>