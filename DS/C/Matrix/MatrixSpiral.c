#include <stdio.h>
#define ROW 3
#define COL 3

int main()
{
    int matrix[ROW][COL] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int k, i, j;

    for (i = 0; i < ROW; i++)
    {
        if (i == 0)
        {
            for (j = 0; j < COL; j++)
            {
                printf("%d ", matrix[i][j]);
            }
        }
        else if (i >= 1 && i < ROW - 1)
        {
            printf("%d ", matrix[i][COL - 1]);
        }

        else if (i == ROW - 1)
        {
            for (j = COL - 1; j >= 0; j--)
            {
                printf("%d ", matrix[i][j]);
            }
            k = i;
        }
        k--;
        // printf("\nk=%d\n", k);
        if (k == 1)
        {
            for (j = 0; j <= COL - 2; j++)
            {
                printf("%d ", matrix[k][j]);
            }
        }
    }

    printf("\n");
    return 0;
}

//  1 2 3 6 9 8 7 4 5
