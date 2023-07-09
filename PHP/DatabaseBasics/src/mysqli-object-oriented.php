<?php

namespace mysql;

require_once 'env.php';

class participant
{
    private $connection = null;
    function __construct()
    {
        $this->connection = new \mysqli(HOST, USERNAME, PASSWORD, DATABASE);

        if ($this->connection->connect_error)
            die("Connection failed: " . $this->connection->connect_error);
        else
            echo "Connection successful!\n";
    }

    function create(string $name): string
    {
        $sql = "INSERT INTO participant(name) VALUES('$name')";
        if ($this->connection->query($sql) === true)
            return "Data inserted successfully!\n";
        else
            return "Error: " . $this->connection->error;
    }

    function read()
    {
        
    }
}

// $participant = new participant();
// $participant->create();
