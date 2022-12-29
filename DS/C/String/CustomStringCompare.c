#include <stdio.h>

// int compare(const char *s1, const char *s2);
// int length(const char *s);

// int main()
// {
//     int ret = compare("Avichal", "Mrityunjay");
//     printf("Return Value: %d\n", ret);
//     return 0;
// }

int length(const char *s)
{
    int i=0;
    while(s[i] != '\0')
    {
        i++;
    }
    return i;
}

int compare(const char *s1, const char *s2)
{
    int i;
    int l = length(s1) > length(s2)?length(s1):length(s2);
    for(i=0; i<l; i++)
    {
        if(s1[i]>s2[i])
        {
            return 1;
        }
        else if(s1[i]<s2[i])
        {
            return -1;
        }
    }
    return 0;
}
