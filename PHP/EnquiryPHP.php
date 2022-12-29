<?php

$servername = "localhost";	//localhost = me
$username = "student";
$password = "student";

$con = new mysqli($servername, $username, $password);

if ($con->connect_error) {
	die("Connection failed: " . $con->connect_error);
}

echo "Connected successfully\n";
