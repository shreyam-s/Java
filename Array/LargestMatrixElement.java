package Array;

import java.util.Scanner;

public class LargestMatrixElement {
    static int findLargest(int mat[][]){
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] > max){
                    max = mat[i][j];
                }
            }
        }
        return max;
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
        int maxElement = findLargest(mat);
        System.out.print("The largest no of a matrix is: " + maxElement);

        sc.close();
    }
}
