package Sorting;

import java.util.*;

public class InsertionSort {

    // Insertion Sort Algorithm
    static void insertionSort(int[] arr){
        int a = arr.length;
        for(int j=1; j<a; j++){
            int key = arr[j];
            int i = j-1;

            while (i>=0 && arr[i]>key) {
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = key;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int n = sc.nextInt();

        // Input an Array
        System.out.println("Enter the elements of an Array: ");
        int arr[] = new int[n];
        for(int m=0;m<n;m++){
            arr[m] = sc.nextInt();
        }
        // Sort using Insetion Sort
        insertionSort(arr);

        // U can also print sorted array like this
        // System.out.println();
        // for(int l=0; l<n; l++){
        //     System.out.println(arr[l]);
        // }
        
        System.out.println("\nSorted Array: " + Arrays.toString(arr));

        sc.close();
    }
}
