// Basic and simple code

import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year: ");
        int n = sc.nextInt();

        if((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0 )){
            System.out.println("Year " + n + " is a Leap Year");
        }
        else{
            System.out.println("Year " + n + " is not a Leap Year");
        }

        sc.close();
    }
}


/*  Using a function


import java.util.*;

public class LeapYear {
    static void leapYear(int n){
        if((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)){
            System.out.println("Year " + n + " is a Leap Year");
        }
        else{
            System.out.println("Year " + n + " is not a Leap Year");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year: ");
        int n = sc.nextInt();

        leapYear(n);

        sc.close();
    }
}
*/