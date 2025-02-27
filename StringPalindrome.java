import java.util.*;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = sc.next();
        int l=a.length()/2;
        boolean g=true;

        if(a.length()%2==0){
        for(int i=0;i<l;i++){
            if(a.charAt(i)!=a.charAt((l*2)-1-i)){
                g=false;

            }
        }
    }
    else{
        for(int i=0;i<l;i++){
            if(a.charAt(i)!=a.charAt((l*2)-i)){
                g=false;

            }
        }
    }
    if(g==false){
        System.out.println("not a pallindrome");
    }
    else{
        System.out.println("Pallindrome");
    }
            
    }
    
}