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
			<p>Table of Gym Leaders from all Pokémon games</p>
	</div>
	<div>
		<div class="Table-Filter">
			<label for="trFilter"> Name:</label>
			<input type="text" id="trInput" class="input-text" placeholder="Search...">
		</div>
		<table id="trTable" style="margin: 1em auto;">
			<thead>
				<tr>
					<th>Image</th>
					<th>Name</th>
					<th>Gender</th>
					<th>Type</th>
					<th>Hometown</th>
					<th>Region</th>
					<th>Badge</th>
					<th>Badge Image</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${allG}" var="c">
					<tr>
						<td><img src="imgG/${c.getG_ID()}.png"></img></td>
						<td>${c.getG_Name()}</td>
						<td>${c.getG_Gender()}</td>
						<td>${c.getG_Type()}</td>
						<td>${c.getG_Hometown()}</td>
						<td>${c.getG_Region()}</td>
						<td>${c.getG_Badge()}</td>
						<td><img src="imgBadge/${c.getG_ID()}.png"></img></td>

					</tr>
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
			var rows = document.querySelector("#trTable tbody").rows;

			for (var i = 0; i < rows.length; i++) {
				var secondCol = rows[i].cells[1].textContent.toUpperCase();

				if (secondCol.indexOf(filter) > -1) {
					rows[i].style.display = "";
				} else {
					rows[i].style.display = "none";
				}
			}
		}

		document.querySelector('#trInput').addEventListener('keyup', filterTable, false);
	</script>
</body>
</html>