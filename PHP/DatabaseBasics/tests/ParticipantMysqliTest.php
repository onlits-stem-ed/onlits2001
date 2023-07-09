<?php declare(strict_types=1);

use mysql\participant;
use PHPUnit\Framework\TestCase;

final class ParticipantMysqliTest extends TestCase
{
    public function testCreateMethodWorkedSuccessfully(): void
    {
        $str = "Data inserted successfully!\n";     //expected output
        $participant = new participant();
        $res = $participant->create('Raju Kumar');              //actual output
        $this->assertSame($str, $res);
    }
}