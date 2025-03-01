package Array;

import java.util.*;

public class LeadersInArray {
    // function to find leaders in an Array
    static ArrayList<Integer> findLeader(int arr[]){
        ArrayList<Integer> leaders = new ArrayList<>();
        int n = arr.length;

        // If array is empty
        if(n == 0){
            return leaders;
        }

        //Right most element is always a leader.
        int currentLeader = arr[n-1];
        leaders.add(currentLeader);

        // Loops for right to left
        for(int i = n-2; i>=0; i--){
            if(arr[i] >= currentLeader){
                currentLeader = arr[i];
                leaders.add(currentLeader);
            }
        }
        // Reverse to maintain the correct order
        Collections.reverse(leaders);
        return leaders;
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
        // function call
        findLeader(arr);

        System.out.println("The Leaders of the Given Array will be " + (findLeader(arr)));

        sc.close();
    }
}