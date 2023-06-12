#include <stdio.h>
#define MAX 100
void split_array(const int array[], const int size);
int main()
{
    int array[MAX] = {5, 37, 19, 25, 99, 2, 56, 21, 44};
    int size = 9;
    split_array(array, size);
    return 0;
}

void display(const int array[], const int size)
{
    for (int i = 0; i<size; i++)
    {
        printf("%5d", array[i]);
    }
    printf("\t");
}

void split_array(const int array[], const int size)
{
    if(size==1)
    {
        return;
    }

    int LB = 0;
    int UB = size - 1;
    int mid = size%2==0?(LB + UB) / 2:(LB + UB) / 2;


    int LA[mid];
    int RA[mid];
    
    for (int i = LB; i < mid; i++)
    {
        LA[i] = array[i];
    }
    for(int i = mid+1; i<=UB; i++)
    {
        RA[i-(mid+1)] = array[i];
    }
    
    
    display(LA, mid);
    
    display(RA, mid);

    printf("\n");
    printf("\n");

    split_array(LA, mid);
    split_array(RA, mid);

    printf("\n");
}