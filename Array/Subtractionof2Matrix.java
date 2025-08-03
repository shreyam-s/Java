package Array;

import java.util.Scanner;

public class Subtractionof2Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of 1st matrix: ");
        int rows = sc.nextInt();
        System.out.print("Eneter the size of 2nd matrix: ");
        int cols = sc.nextInt();

        System.out.println("Enter 1st Matrix:");
        int[][] mat1 = inputMatrix(rows, cols, sc);
        System.out.println("Enter 2nd Matrix:");
        int[][] mat2 = inputMatrix(rows, cols, sc);

        int[][] diff = subtractMatrix(mat1, mat2);
        System.out.println("Difference of the two matrices:");
        printMatrix(diff);
    }

    static int[][] inputMatrix(int rows, int cols, Scanner sc) {
        int[][] mat = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        return mat;
    }

    static void printMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] subtractMatrix(int[][] mat1, int[][] mat2) {
        int rows = mat1.length;
        int cols = mat1[0].length;
        int[][] diff = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                diff[i][j] = mat1[i][j] - mat2[i][j];
            }
        }
        return diff;
    }
}