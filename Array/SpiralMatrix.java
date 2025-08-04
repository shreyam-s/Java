package Array;

import java.util.Scanner;

public class SpiralMatrix {

    static void printSpiralMatrix(int[][] matrix, int rows, int cols) {
        int topRow = 0, bottomRow = rows - 1, leftCol = 0, rightCol = cols - 1;
        int totalElements = 0;

        while (totalElements < rows * cols) {
            for (int j = leftCol; j <= rightCol && totalElements < rows * cols; j++) {
                System.out.print(matrix[topRow][j] + " ");
                totalElements++;
            }
            topRow++;
            for (int i = topRow; i <= bottomRow && totalElements < rows * cols; i++) {
                System.out.print(matrix[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--;
            for (int j = rightCol; j >= leftCol && totalElements < rows * cols; j--) {
                System.out.print(matrix[bottomRow][j] + " ");
                totalElements++;
            }
            bottomRow--;
            for (int i = bottomRow; i >= topRow && totalElements < rows * cols; i--) {
                System.out.print(matrix[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Spiral Order:");
        printSpiralMatrix(matrix, rows, cols);

        sc.close();
    }
}
