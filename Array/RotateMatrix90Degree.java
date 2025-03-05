/*

Steps to solve ->

Step 1-> fint the Transpose of a matrix
Step 2-> Reverse each row

*/

package Array;

import java.util.Scanner;

public class RotateMatrix90Degree {
    static int[][] rotate(int mat[][], int rows, int cols){
        //Transpose of a Matrix
        int trans[][] = new int[cols][rows];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                trans[j][i] = mat[i][j];
            }
        }
        //Reverse each Row
        for(int i = 0; i < cols; i++){
            int start = 0, end = rows -1;    //start-> from the left //end -> from the right
            while(start < end){
                int temp = trans[i][start];
                trans[i][start] = trans[i][end];
                trans[i][end] = temp;
                start++;
                end--;
            }
        }
        return trans;  //return the rotated matrix
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input dimension of matrix
        System.out.print("Enter the no of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the no of columns: ");
        int cols = sc.nextInt();

        int mat[][] = new int[rows][cols];

        //input the elements in matrix
        System.out.print("Enter the matrix elements: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix");
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        int rotatedMatrix[][] = rotate(mat, rows, cols);

        System.out.println("Matrix after 90 degree rotation");
        for(int i = 0; i < rotatedMatrix.length; i++){
            for(int j = 0; j < rotatedMatrix[0].length; j++){
                System.out.print(rotatedMatrix[i][j] + " ");
            }
            System.out.println();
        }
 
        sc.close();
    }
}
