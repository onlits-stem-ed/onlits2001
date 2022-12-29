#include <stdio.h>

void display(int *p);

int main()
{
    int a;
    const int *p = &a;  //address is not constant where value is constant (readonly)
    int x = 10;
    int *const ptr;     //address is contant and not value
    // *p = 10;
    // ptr = &x;
    // a=10;
    printf("a=%d\n", a);
    printf("ptr=%p\n",ptr);
    scanf("%d", ptr);
    int arr[] = {10, 20, 30, 40, 50};
    display(arr);
    return 0;
}

void display(int *p)
{
    printf("The elements of array are:\n");
    for (int i = 0; i < 5; i++)
    {
        printf("%d\n", *p);
        printf("%p\n", p);
        p++;
    }
}