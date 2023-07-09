<?php
require_once 'env.php';

$connection = mysqli_connect(HOST, USERNAME, PASSWORD, DATABASE);
if (!$connection)
    die("Connection failed: " . mysqli_connect_error());
else
    echo "Connection Successful!\n";

function create($connection)
{
    $sql = "INSERT INTO participant(name) VALUES('Mrityunjay Kumar')";
    if (mysqli_query($connection, $sql))
        echo "Data inserted successfully!\n";
    else
        echo "Error: " . mysqli_error($connection);
}

create($connection);

mysqli_close($connection);
