#include "SortSupport.c"
void selection_sort(int *array, int size)
{
    for (int i = 0; i < size - 1; i++) //O(n^2)
    {
        for (int j = i + 1; j < size; j++) //O(n)
        {
            if (array[i] > array[j])
            {
                swap(&array[i], &array[j]);
            }
        }
    }
}
