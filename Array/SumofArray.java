package Array;

import java.util.Scanner;

public class SumofArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int n = sc.nextInt();

        // Input an Array
        System.out.println("Enter the elements of an Array: ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        // Main Logic
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + arr[i];
        }
        System.out.println("The sum of elements of an Array = " + sum);

        sc.close();
    }   
}
