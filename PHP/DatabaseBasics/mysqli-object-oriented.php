<?php

namespace mysql;

class mysql_mysqli {
    private $connection = null;
    function __construct()
    {
        $connection = new mysqli(HOST, USERNAME, PASSWORD, DATABASE);
    }

}