void displayBits(int x)
{
    int i, mask;
    for (i = 31; i >= 0; i--)
    {
        mask = 1 << i;
        putchar((x & mask) ? '1' : '0'); /*Test and print ith bit*/
        if (i % 8 == 0)
            putchar(' '); /*Space after 8 bits*/
    }
    printf("\n");
}

void displayBitsChar(unsigned char x)
{
    int i, mask;
    for (i = 7; i >= 0; i--)
    {
        mask = 1 << i;
        putchar((x & mask) ? '1' : '0'); /*Test and print ith bit*/
        if (i % 8 == 0)
            putchar(' '); /*Space after 8 bits*/
    }
    printf("\n");
}