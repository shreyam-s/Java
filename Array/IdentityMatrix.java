package Array;

import java.util.Scanner;

public class IdentityMatrix {
    static boolean identityMatrix(int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;

        if (rows != cols) {
            return false;
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(i == j && arr[i][j] != 1){
                    return false;
                }
                if(i != j && arr[i][j] != 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input dimension of matrix
        System.out.print("Enter the no of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the no of columns: ");
        int cols = sc.nextInt();

        int arr[][] = new int[rows][cols];

        //input the elements in matrix
        System.out.print("Enter the matrix elements: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        boolean result  = identityMatrix(arr);
        if(result){
            System.out.println("The matrix is an Identity matrix");
        }
        else{
            System.out.println("The matrix is not an Identity matrix");
        }

        sc.close();
    }
}