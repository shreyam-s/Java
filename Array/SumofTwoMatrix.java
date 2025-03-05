package Array;

import java.util.Scanner;

public class SumofTwoMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input dimension of matrix
        System.out.print("Enter the no of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the no of columns: ");
        int cols = sc.nextInt();

        int mat1[][] = new int[rows][cols];
        int mat2[][] = new int[rows][cols];
        int sum[][] = new int[rows][cols];

        //input elements of 1 matrix
        System.out.println("Elements for 1sr matrix: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                mat1[i][j] = sc.nextInt();
            }
        }

        //input for 2 matrix
        System.out.println("Elements for 2nd matrix: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                mat2[i][j] = sc.nextInt();
            }
        }

        //sum
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                sum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        //print the sum matrix
        System.out.println("Sum of mat1 and mat2 is: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
