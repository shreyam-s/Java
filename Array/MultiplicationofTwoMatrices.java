package Array;

import java.util.*;

public class MultiplicationofTwoMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows of 1st matrix: ");
        int rows1 = sc.nextInt();
        System.out.print("Enter the columns of 1st matrix: ");
        int cols1 = sc.nextInt();

        System.out.print("Enter the rows of 2nd matrix: ");
        int rows2 = sc.nextInt();
        System.out.print("Enter the columns of 2nd matrix: ");
        int cols2 = sc.nextInt();

        if (rows1 != cols2) {
            System.out.println("Matrix multiplication not possible");
            return;
        }

        System.out.println("Enter the elements of 1st matrix:");
        int[][] matrix1 = new int[rows1][cols1];
        inputMatrix(matrix1, sc);
        System.out.println("Enter the elements of 2nd matrix:");
        int[][] matrix2 = new int[rows2][cols2];
        inputMatrix(matrix2, sc);

        int[][] result = multiplyMatrices(matrix1, matrix2);
        System.out.println("Resultant matrix after multiplication:");
        printMatrix(result);
    }

    static void inputMatrix(int[][] matrix, Scanner sc) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] multiplyMatrices(int[][] mat1, int[][] mat2) {
        int rows1 = mat1.length;
        int cols1 = mat1[0].length;
        // int rows2 = mat2.length; //optional, not used..
        int cols2 = mat2[0].length;
        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        return result;
    }
}