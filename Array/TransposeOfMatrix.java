package Array;

import java.util.Scanner;

public class TransposeOfMatrix {
    // Function to compute the transpose of a matrix
    static void Transpose(int trans[][], int mat[][]){
        int rows = mat.length;
        int cols= mat[0].length;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                trans[j][i] = mat[i][j];   //swap rows and colums
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input dimension of matrix
        System.out.print("Enter the no of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the no of columns: ");
        int cols = sc.nextInt();

        int mat[][] = new int[rows][cols];
        int trans[][] = new int[cols][rows];

        //input the elements in matrix
        System.out.print("Enter the matrix elements: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        Transpose(trans, mat);

        System.out.println("Original Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(mat[i][j] + " ");
                trans[j][i] = mat[i][j]; // Compute transpose
            }
            System.out.println();
        }

        System.out.println("Transposed Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
