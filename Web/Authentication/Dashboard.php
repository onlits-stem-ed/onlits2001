<?php
session_start();
$uid = null;
if(!isset($_SESSION['uid'])) {
	echo "<script>alert('Invalid session! Login again! ');</script>";
	echo "<script>window.location.href='index.html';</script>";
} else {
	$uid = $_SESSION['uid'];
}
?>

<html>
	<head>
		<title>Dashboard</title>
	</head>
	
	<body bgcolor="<?php echo $_SESSION['color']?>">
		<div class="container">
			<h1>Dashboard</h1>
			<h3><?php echo $uid;?></h3>
			<p><a href="index.php">Logout</a></p>
		</div>
	</body>
</html>