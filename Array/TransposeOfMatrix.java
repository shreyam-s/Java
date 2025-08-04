package Array;

import java.util.*;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows in a matrix: ");
        int rows = sc.nextInt();
        System.out.print("Enter no of columns in a matrix: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[][] transposedMatrix = transposeMatrix(matrix, rows, cols);
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    static int[][] transposeMatrix(int[][] matrix, int rows, int cols) {
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
}