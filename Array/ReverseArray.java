package Array;

import java.util.Scanner;

public class ReverseArray {
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
        System.out.println();

        // Main Logic
        int i = 0;
        int j = n-1;

        while (i < j) {
            // Swap elements
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            // Move Pointers towards the center
            i++;
            j--;
        }

        for(int k = 0; k < n; k++){
            System.out.print(arr[k] + " ");
        }

        sc.close();
    }    
}
