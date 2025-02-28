package Sorting;

import java.util.*;

public class QuickSort {

    // Method to perform Quick Sort
    static void quick(int A[], int p, int r){
        if(p<r){
            int q = partition(A, p, r);

            quick(A, p, q-1);
            quick(A, q+1, r);
        }
    }

    // Partition method
    static int partition(int A[], int p, int r){
        int x = A[r];     //Choose an Pivot element
        int i = p-1;

        for(int j=p; j<=r-1; j++){
            if(A[j]<=x){
                i++;
                swap(A,i,j);
            }
        }
        swap(A, i+1, r);
        return i+1;
    }

    // Method to swap elements
    static void swap(int A[], int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void main(String[] args) {

        // Size of an Array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int n = sc.nextInt();

        // Input an Array
        System.out.println("Enter the elements of an Array: ");
        int A[] = new int[n];
        for(int m=0;m<n;m++){
            A[m] = sc.nextInt();
        }

        // Sorting the array using Quick Sort
        quick(A, 0, n-1);

        // U can also print sorted array like this
        // System.out.println();
        // for(int l=0; l<n; l++){
        //     System.out.println(arr[l]);
        // }
        
        System.out.println("\nSorted Array: " + Arrays.toString(A));
        
        sc.close();
    }
}
