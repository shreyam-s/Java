import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter te First number: ");
        int a = sc.nextInt();
        System.out.print("Enter the Second number: ");
        int b = sc.nextInt();
        System.out.print("Choose 1-> Add  2-> Subtract  3-> Multiply  4-> Divide \nEnter your Choice: ");
        int ch = sc.nextInt();

        if(ch == 1){
            System.out.print("Addition of " + a + " and " + b + " = " + (a+b));
        }
        else if(ch == 2){
            System.out.print("subtraction of " + a + " and " + b + " = " + (a-b));
        }
        else if(ch == 3){
            System.out.print("Multiplication of " + a + " and " + b + " = " + (a*b));
        }
        else if(ch == 4){
            System.out.print("Division of " + a + " and " + b + " = " + (a/b));
        }
        else{
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
