package Array;

import java.util.Scanner;

public class MaxofArray {
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
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The maximum valuw of the given Array = " + max);

        sc.close();
    }    
}
