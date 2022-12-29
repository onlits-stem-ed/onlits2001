<?php

InsertData();

function InsertData()
{
    $con = new mysqli("localhost", "john", "123", "Clinic2001");

    if ($con->connect_error) {
        die("Connection failed: " . $con->connect_error);
    }

    $did = GenerateDID();
    $dname = $_POST['TxtDoctorName'];


    $sql = "INSERT INTO Doctor(DoctorId, DoctorName) VALUES('$did', '$dname')";

    if ($con->query($sql) == TRUE) {
        echo "Record entered successfully. Doctor id is " . $did;
    } else {
        echo "Error: " . $con->error;
    }

    $con->close();
}

function GenerateDID()
{
    $con = new mysqli("localhost", "john", "123", "Clinic2001");

    if ($con->connect_error) {
        die("Connection failed: " . $con->connect_error);
    }

    $sql = "SELECT DoctorId FROM Doctor";

    $result = $con->query($sql);

    if ($result->num_rows > 0)
        while ($row = $result->fetch_assoc()) {
            $did = $row['DoctorId'];
        }

    $con->close();

    
    $did = substr($did, 1, 3);

    $did = $did + 1;

    if($did<10)
    $did = "D00" . $did;
    elseif($did<100)
    $did = "D0" . $did;
    else
    $did = "D" . $did;

    return $did;
}