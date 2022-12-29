package local.onlits.onlits2001.classobject;

public class Matrix {
    int row;
    int column;
    int[][] elements;

    Matrix(){

    }

    Matrix(int[][] elements, int row, int column) {
        elements = new int[row][column];
    }

    void display() {
        for(int i=0; i<=row;i++) {
            for(int j=0; j<column; j++)
            {
                System.out.println(elements[i][j]);
            }
        }
    }
}
