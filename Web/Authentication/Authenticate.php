<?php
session_start();

$uid = $_POST['userid'];	//Associative Array - Key-value pair
$pwd = $_POST['password'];

if($uid=='root' && $pwd='123') {
	$_SESSION['uid'] = $uid;
	$_SESSION['color'] = 'green';
	echo "<script>window.location.href='Dashboard.php';</script>";
} else {
	echo "<script>alert('Invalid UserId/Password!');</script>";
	echo "<script>window.location.href='index.php';</script>";
}
