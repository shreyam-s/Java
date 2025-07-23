package Array;

import java.util.*;

public class SecondLargestElement {

    static int findmax(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    static int secondLargest(int[] arr) {
        int mx = findmax(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == mx) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = findmax(arr);
        return secondMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();
        System.out.println("Enter the values: ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Second Largest Element is " + secondLargest(arr));

        sc.close();
    }
}