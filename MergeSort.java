 import java.util.*;

public class MergeSort {
    
    static void Merge(int[] A,int p, int r){
        int q=0;
        if(p<r){
            // Dividing an Array into Two Parts
            q=(p+r)/2;
            Merge(A,p,q);
            Merge(A,q+1,r);
            MergeS(A,p,q,r);
        }
    }
    public static void MergeS(int[] A,int p,int q, int r){

        // Implementing algo. of Merge Sort
        int n1 = q-p+1;
        int n2 = r-q;

        int L[]= new int[n1+1];
        int R[]= new int[n2+1];

        for(int i=0;i<n1;i++){
            L[i]= A[p+i];
            L[i+1]=300000;    //Maximum Value of Integer
        }
        for(int j=0;j<n2;j++){
            R[j]= A[q+1+j];
            R[j+1]=300000;    //Maximum Value of Integer
        }

        int i=0;
        int j=0;

        for(int k=p; k<=r;k++){
            if(L[i]<=R[j]){
                A[k]=L[i];
                i=i+1;
            }
            else {
                A[k]=R[j];
                j=j+1;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int n = sc.nextInt();

        // Input an Array
        System.out.println("Enter the elements of an Array: ");
        int A[] = new int[n];
        for(int m=0;m<n;m++){
            A[m] = sc.nextInt();
        }
        Merge(A,0,n-1);
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.println(A[i]);
        }
    }
}
