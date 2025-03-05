package Array;

import java.util.Scanner;

public class MatrixisSymmetric {
    static boolean checkSymmetric(int mat[][]){
        int rows = mat.length;
        int cols = mat[0].length;

        if(rows != cols){
            return false;
        }
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < i; j++){     //only check the upper triangle
                if(mat[i][j] != mat[j][i]){
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

        int mat[][] = new int[rows][cols];

        //input the elements in matrix
        System.out.print("Enter the matrix elements: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        if(checkSymmetric(mat)){
            System.out.println("The matrix is symmetric");
        }
        else{
            System.out.println("The matrix is not symmetric");
        }

        sc.close();
    }
}
