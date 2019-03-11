<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>The Ultimate Pokemon Database</title>
<meta <%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix= "c" %>>
<link rel="stylesheet" href="site.css">
</head>
<body>
	<img src="headerimg.png"></img>
	<h1 align="center">Complete Pokémon Pokédex</h1>
	<a class="btn" href="./home">Back to menu</a>
	<p>pokemon pokemon pokemon</p>
	<div>
		<div class="Table-Filter">
			<label for="pkFilter"> Name:</label> 
			<input type="text" class="input-text" id="pkFilter"  onkeyup="myFunction()" data-filter-col="3">
		</div>
		<table style="margin: 1em auto;">
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
			<tr id = "pkTable">
				<td><img src ="imgP/${c.getP_id()}.ico"></img></td>
					<td>${c.getP_id()}</td>
					<td id="td">${c.getP_name()}</td>
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
		</table>
		<button onclick="topFunction()" id="topBtn" title="Go to top">Go
			to top</button>
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
		
		function myFunction() {
			var input, filter, th, td, a, i, txtValue;
			input = document.getElementById("pkFilter");
			filter = input.value.toUpperCase();
			th = document.getElementById("pkTable");
			td = td.getElementsByTagName(td);
			for (i = 0; i < td.length; i++) {
				a = td[i].getElementsByTagName("a")[0];
				txtValue = a.textContent || a.innerText;
				if (txtValue.toUpperCase().indexOf(filter) > -1) {
					td[i].style.display = "";
				} else {
					td[i].style.display = "none";
				}
			}
		}
	</script>
</body>
</html>