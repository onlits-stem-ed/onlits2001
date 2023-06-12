#include <stdio.h>

void tower_of_hanoi(int n, char source, char destination, char auxilary);

int main()
{
    tower_of_hanoi(3, 'A', 'C', 'B');
    return 0;
}

void tower_of_hanoi(int n, char source, char destination, char auxilary)
{
    static int count;
    count++;
    printf("Call#%d\n", count);
    if (n == 1)
    {
        printf("[if block] Move disk %d from rod %c to rod %c.\n", n, source, destination);
    }
    else
    {
        tower_of_hanoi(n - 1, source, auxilary, destination);
        printf("[else block] Move disk %d from rod %c to rod %c.\n", n, source, destination);
        tower_of_hanoi(n - 1, auxilary, destination, source);
    }
}