<?php
$connection = null;

function connect()
{
    $connection = new mysqli(HOST, USERNAME, PASSWORD, DATABASE);
}
