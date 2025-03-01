// Sum of Even digit and Product of Odd Digit->>

import java.util.*;

public class SumNdProductofDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int digit, sum = 0, pro = 1;

        while (n > 0 ) {
            digit = n%10;
            if(digit % 2 == 0){
                sum = sum + digit;
            }
            else{
                pro = pro * digit;
            }
            n = n/10;
        }
        System.out.println("Sum of Even Digit is " + sum + " and Product of Odd digit is " + pro);


        sc.close();
    }
}
