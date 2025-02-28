/*

* 
* * 
* * * 
* * * * 
* * * * * 

*/

package Patterns;

import java.util.*;

public class Pattern1 {

    static void StarRightTriangle(int n){

        // outer loop to handle number of rows
        for(int i=0; i<n; i++){

        // inner loop to handle number of columns
            for(int j=0; j<=i; j++){
                // printing stars
                System.out.print("* ");
            }
            // end line
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();

        StarRightTriangle(n);

        sc.close();
    }
}
