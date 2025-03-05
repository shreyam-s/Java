package Array;

import java.util.Scanner;

public class sumRowsandCols {
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
        //Calculate and print row sum
        System.out.println("Sum of each Row: ");
        for(int i = 0; i < rows; i++){
            int rowSum = 0;
            for(int j = 0; j < cols; j++){
                rowSum += mat[i][j];
            }
            System.out.println("Row " + (i+1) + ": " + rowSum);
        }
        //Calculate and print column sum
        System.out.println("Sum of each Column: ");
        for(int j = 0; j < cols; j++){
            int colSum = 0;
            for(int i = 0; i < rows; i++){
                colSum += mat[i][j];
            }
            System.out.println("Column " + (j+1) + ": " + colSum);
        }

        sc.close();
    }
}
