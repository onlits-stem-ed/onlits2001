#include <stdio.h>
#define ROW 3
#define COL 3
void display(int row, int col, int matrix[row][col]);
int main()
{
    int matrix[ROW][COL] = {{1,2,3},{4,5,6},{7,8,9}};
    display(ROW, COL, matrix);
    return 0;
}

void display(int row, int col, int matrix[row][col])
{
    for(int i=0; i<row; i++)
    {
        for(int j=0; j<col; j++)
        {
            printf("%d ", matrix[i][j]);
        }
        printf("\n");
    }
}