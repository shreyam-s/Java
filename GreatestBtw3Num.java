import java.util.Scanner;

public class GreatestBtw3Num {
    static void Greatest(int a, int b, int c){
        if(a>=b && a>=c){
            System.out.println(a + " is Greatest Number");
        }
        else if(b>=a && b>=c){
            System.out.println(b + " is Greatest Number");
        }
        else{
            System.out.println(c + " is Greatest Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st No : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd No : ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd No : ");
        int c = sc.nextInt();

        Greatest(a, b, c);

        sc.close();
    }
}
