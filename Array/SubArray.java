// Algorithm
/*

Array = [1,2,3,4]

si | ei | Array
 0 |  0 | [1]
 0 |  1 | [1,2]
 0 |  2 | [1,2,3]
 0 |  3 | [1,2,3,4]
 1 |  1 | [2]
 1 |  2 | [2,3]
 1 |  3 | [2,3,4]
 2 |  2 | [3]
 2 |  3 | [3,4]
 3 |  3 | [4]

*/

package Array;

import java.util.Scanner;

public class SubArray {
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
        for(int si = 0; si < n; si++){
            for(int ei = si; ei < n; ei++){
                //Print all the subarray
                for(int k = si; k <= ei; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
 
        sc.close();
    }
}