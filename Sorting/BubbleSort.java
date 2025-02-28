package Sorting;

import java.util.*;

public class BubbleSort {
    // Bubble sort algo
    static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            boolean swap = false;
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(swap == false){
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input Size of an array
        System.out.print("Enter the size of an Array: ");
        int n = sc.nextInt();

        // Enter the elements of Array
        System.out.println("Enter the elements of an Array: ");
        int arr[] = new int[n];
        for(int k=0; k<n; k++){
            arr[k] = sc.nextInt();
        }
        // Sorted using Bubble Sort
        bubbleSort(arr);

        // U can also print sorted array like this
        // System.out.println();
        // for(int l=0; l<n; l++){
        //     System.out.println(arr[l]);
        // }

        System.out.println("\nSorted Array: " + Arrays.toString(arr));


        sc.close();
    }
}