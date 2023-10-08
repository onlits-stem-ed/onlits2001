/*

You are given a binary array arr of size N consists of 0 and 1.
It arr[i]=0 then there is a white stone present at the index i and
if arr[i]=1 then there is a black stone preset at the index i

You have infinite no of boxes of size K and you need to separate
white and black stones by putting them into different boxes. Find
the minimum no of box require to separate white and black stones
by putting them into different boxes.

Note: You cannot put more than K stones in a single box.

Example 1:

Input:

N = 4, K = 2 arr[] = {1,0,1,0)

Output: 2

Sclave Solution E

int separatestows I code here

Explanation: We can put first and third black stones into 1st box and second and fourth white stones into 2nd box.

Example 1:

Input:

N=5, K = 2

arr[] (1,1,1,1,1)

Output: 3

*/

#include <iostream>

using namespace std;

int SortStones(int *arr, int n, int k);

int main(void)
{
    int arr1[] = {1, 0, 1, 0};
    int arr2[] = {1, 1, 1, 1, 1};
    cout << "Test Case 1:" << endl;
    cout << "TC1. Minimum numer of boxes required: " << SortStones(arr1, 4, 2) << endl;
    cout << "Test Case 2:" << endl;
    cout << "TC2. Minimum numer of boxes required: " << SortStones(arr2, 5, 2) << endl;
}

int SortStones(int *arr, int n, int k)
{
    int total_no_of_boxes, white_boxes = 0, black_boxes = 0, white_stones = 0, black_stones = 0;
    for (int i = 0; i < n; i++)
    {
        if (arr[i] == 0)
        {
            if (white_stones == 0)
                white_boxes++;

            white_stones++;

            if (white_stones == k)
                white_stones = 0;
        }
        else
        {
            if (black_stones == 0)
                black_boxes++;

            black_stones++;

            if (black_stones == k)
                black_stones = 0;
        }
    }

    total_no_of_boxes = white_boxes + black_boxes;

    return total_no_of_boxes;
}