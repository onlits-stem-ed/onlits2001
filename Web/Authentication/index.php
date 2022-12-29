<?php
	session_start();
?>
<html>
	<head>
		<title>Login</title>
		<!-- CSS only -->
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
	</head>
	
	<body>
		<div class="content">
			<form action="Authenticate.php" method="POST">
				<input type="text" name="userid" id="userid" placeholder="UserID" class="form-control"><br>
				<input type="password" name="password" id="password" placeholder="Password" class="form-control"><br>
				<button type="submit">Login</button>
			</form>
		</div>
	</body>
</html>

<?php
	session_destroy();
?>