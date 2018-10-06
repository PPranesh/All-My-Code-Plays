//Reverse the Array

import java.util.Scanner;
public class Arrays {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        //System.out.println("Enter the n'th value: ");
        int n = s.nextInt();
        int A[] = new int[n];
        //System.out.println("Enter the numbers: ");
        for(int i=0;i<n;i++){
            A[i] = s.nextInt();
        }
        //System.out.println("The result is : ");
        for(int i=n-1;i>=0;i--){
            System.out.print(A[i]+" ");
        }       
    }
}




