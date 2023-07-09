<?php

namespace pdo;

use PDOException;

require_once 'env.php';

class participant
{

    private $connection = null;

    function __construct()
    {
        try {
            $this->connection = new \PDO(CONNECTION_STRING, USERNAME, PASSWORD);
            echo "Connection Successful!\n";
            $this->connection->setAttribute(\PDO::ATTR_ERRMODE, \PDO::ERRMODE_EXCEPTION);
        } catch (PDOException $e) {
            echo "Connection failed: " . $e->getMessage();
        }
    }

    function create()
    {
        try {
            $sql = "INSERT INTO participant(name) VALUES('Mrityunjay Kumar')";
            $this->connection->exec($sql);
            echo "Data inserted successfully!\n";
        } catch (PDOException $e) {
            echo "Connection failed: " . $e->getMessage();
        }
    }

    function __destruct()
    {
        $this->connection = null;
    }
}

$participant = new participant();
$participant->create();