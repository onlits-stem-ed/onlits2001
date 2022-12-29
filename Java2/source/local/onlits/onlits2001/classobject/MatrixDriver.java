package local.onlits.onlits2001.classobject;

public class MatrixDriver {
    public static void main(String[] args) {
        int[][] elements = {{1, 2, 3},{4, 5, 6}, {7, 8, 9}};
        Matrix matrix = new Matrix(elements, 3, 3);
        matrix.display();
    }
}
