package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Sort012InArray {
    // Function to sort 0s, 1s, 2s in an Array
    static void Sort012(int arr[]){
        int n = arr.length;
        int c0 = 0, c1 = 0, c2 = 0;

        // Count 0s, 1s and 2s
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                c0++;
            }
            else if(arr[i] == 1){
                c1++;
            }
            else{
                c2++;
            }
        }

        int index = 0;

        // Place 0s
        for(int i = 0; i < c0; i++){
            arr[index++] = 0; 
        }
        // Place 1s
        for(int i = 0; i < c1; i++){
            arr[index++] = 1;
        }
        // Place 2s
        for(int i = 0; i < c2; i++){
            arr[index++] = 2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input size of an array
        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();

        // Input an array
        int arr[] = new int[n];
        System.out.print("Enter the elements of an array: ");
        for (int j = 0; j < n; j++) {
            arr[j] = sc.nextInt();
        }
        // Function call
        Sort012(arr);

        System.out.println("Sorted Array is: " + Arrays.toString(arr));

        sc.close();
    }
}
