#include <stdio.h>

void fun1(int *p);
void fun2(int **q);

int main()
{
    int a = 10;
    printf("main: Address of a %p.\n", &a);
    printf("The value of a before calling fun1() is %d.\n", a);
    fun1(&a);
    printf("The value of a after calling fun1() is %d.\n", a);
}

void fun1(int *p)
{
    printf("fun1: Value of p (address of a) before calling fun2 is %p.\n", p);
    fun2(&p);
    printf("fun1: Value of p after calling fun2 is %p.\n", p);
}

void fun2(int **q)
{
    printf("fun2: Value of q (address of p) before incrementing is %p.\n", q);
    printf("fun2: Value of *q before incrementing is %p.\n", *q);
    (*q)++;
    printf("fun2: Value of q (address of p) after incrementing is %p.\n", q);
    printf("fun2: Value of *q before incrementing is %p.\n", *q);
}