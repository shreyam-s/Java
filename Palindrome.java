import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        
        int n, sum=0, d, x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        x = n;

        while (n > 0) {
            d = n % 10;
            sum = sum * 10 + d;
            n = n / 10;
        }

        if(sum == x){
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is not a Palindrome");
        }

        sc.close();
    }
}