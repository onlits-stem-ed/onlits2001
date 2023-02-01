<?php
use PHPUnit\Framework\TestCase;
include 'Addition.php';
class TestAdd extends TestCase
{
    function testAdd() : void
    {
        $this->assertEquals(30, add(10, 20));
        $this->assertEquals(3, add(1, 2));
    }
}