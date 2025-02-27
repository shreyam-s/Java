import java.util.*;

public class NumberofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        int temp=0;
        if(num==0){
            System.out.println("1");
        }
        else{  
            while (num>0) {
                ++temp;
                num = num/10;
            }
            System.out.println("The number of digits are: " + temp);
        }

        sc.close();
    }
}