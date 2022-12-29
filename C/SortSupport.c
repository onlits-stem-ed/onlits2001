void swap(int *i, int *j)
{
    int t = *i;
    *i = *j;
    *j = t;
}

void display(int *array , int size)
{
    for (int i = 0; i < size; i++)
    {
        printf("%d\n", array[i]);
    }
}