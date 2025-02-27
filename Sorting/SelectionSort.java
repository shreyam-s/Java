package Sorting;

import java.util.*;

public class SelectionSort {

    // Selection sort
    static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int index = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[index]){
                    index = j;
                }
            }
            // Swap elements outside the inner loop
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int n = sc.nextInt();

        // Input an Array
        System.out.println("Enter the elements of an Array: ");
        int arr[] = new int[n];
        for(int m=0; m<n; m++){
            arr[m] = sc.nextInt();
        }

        // Sorting the array using Selection Sort
        selectionSort(arr);

        System.out.println();
        for(int k=0; k<n; k++){
            System.out.println(arr[k]);
        }

        sc.close();
    }
}
