import java.util.Arrays;
import java.util.*;

public class sumOfevenDigitsinArr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        System.out.print("enter the elements of an array: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);//n^2

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                sum = sum + arr[i];
            }
        }
        System.out.print("Sum of even elements in an array: " + sum);

        sc.close();
    }
}