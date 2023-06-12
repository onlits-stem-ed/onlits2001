void displayBits(int x)
{
    long long bin = 0;
    int t = 1;
    while (x > 0)
    {
        int d = x % 2;
        bin = d * t + bin;
        x /= 2;    
        t *= 10;
    }
    printf("%lld\n", bin);
}