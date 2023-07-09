<?php declare(strict_types=1);
function swap(int $a, int $b)
{
    echo "Values of a and b before swapping are $a and $b, respectively\n";
    $t = $a;
    $a = $b;
    $b = $t;
    echo "Values of a and b after swapping are $a and $b, respectively\n";
}

// swap(100.9, 200.5);      //uncomment this line to see the effect of declare(strict_types=1)