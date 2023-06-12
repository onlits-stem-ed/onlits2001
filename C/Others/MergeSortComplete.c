#include <stdio.h>

void merge(int arr[], int beg, int mid, int end);
void merge_sort(int arr[], int beg, int end);
void display(int arr[], int beg, int end);

int main()
{
    int arr[] = {5, 37, 19, 25, 99, 2, 56, 21, 44};
    int beg = 0, end = (sizeof(arr)/sizeof(int))-1;
    display(arr, beg, end);
    merge_sort(arr, beg, end);
    display(arr, beg, end);
    return 0;
}

void merge(int arr[], int beg, int mid, int end)
{
    // printf("\n--Merge--\n");
    int i, j, k;
    int l = mid - beg + 1;             //length of left array
    int r = end - mid;                 //length of right array

    int left_array[l], right_array[r];

    printf("LA: ");
    for(i=0; i<l; i++)
    {
        left_array[i] = arr[beg + i];
        printf("%d ", left_array[i]);
    }

    printf("\nRA: ");
    for(j=0; j<r; j++)
    {
        right_array[j] = arr[mid+1];
        printf("%d ", right_array[j]);
    }
    printf("\n");

    i = 0;
    j = 0;

    k = beg;

    while(i < l && j < r)
    {
        if(left_array[i] <= right_array[j])
        {
            arr[k] = left_array[i];
        }
        else
        {
            arr[k] = right_array[j];
        }
        i++;
        j++;
        k++;
    }

    // while(i<l)
    // {
    //     arr[k] = left_array[i];
    //     i++;
    //     k++;
    // }

    // while (j<r)
    // {
    //     arr[k] = right_array[j];
    //     j++;
    //     k++;
    // }
}

void merge_sort(int arr[], int beg, int end)
{
    int mid;
    if (beg < end)
    {
        mid = (beg + end) / 2;
        // display (arr, beg, mid);
        // printf("\t");
        // display (arr, mid+1, end);
        // printf("\n");
        merge_sort(arr, beg, mid);                      //left part
        merge_sort(arr, mid + 1, end);                  //right part
        merge(arr, beg, mid, end);
    }
    else
    {
        //display(arr, beg, end);
    }
}

void display(int arr[], int beg, int end)
{
    // printf("\n");
    for(int i = beg; i<=end; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");
    // printf("\n");
}