<html>
	<head>
	
	</head>
	<body>
		<header>
			<?php
				include 'Header.php';
			?>
		</header>
		<form method="POST" action="#">
			<p>User Id: <input type="text" name="TxtUserId" required></p>
			<p>Password: <input type="password" name="TxtPassword"></p>
			<p><button>Login</button>
			
<?php
$uid = $_POST["TxtUserId"];
$pass = $_POST["TxtPassword"];

if(isset($uid)) {
	$con = new mysqli("localhost","john","123","Clinic2001");
	//echo "Connection Successful!\n";
	
	$sql = "Select userid from User where userid='$uid'";
	
	$result = $con->query($sql);
	
	if($result->num_rows > 0) {
		$sql = "Select userid from User where userid='$uid' and password='$pass' and status='A'";
		$result = $con->query($sql);

		if($result->num_rows > 0) {
			echo "<p><label>Login Successful!</label></p>";
			$sql = "INSERT INTO AuthenticationLog(userid, date, time, attempt) VALUES('$uid',CURDATE(),CURTIME(),'S')";
			$con->query($sql);

		} else {
			echo "<p><label>Login Failed!</label></p>";
			$sql = "INSERT INTO AuthenticationLog(userid, date, time, attempt) VALUES('$uid',CURDATE(),CURTIME(),'F')";
			$con->query($sql);
		}
	} else {

		echo "<p><label>Invalid User!</label></p>";
	}
	$con->close();	
}
?>

		</form>
		<footer>
		<?php
				include 'Footer.php';
			?>
		</footer>
	</body>
	
</html>