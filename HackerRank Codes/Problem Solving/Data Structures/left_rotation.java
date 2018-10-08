/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pranesh
 */
import java.math.BigInteger;
import java.util.Scanner;
public class left_rotation {
    public static void main(String[] args){
        int temp,j;
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = s.nextInt();
        int Z[] = new int[n];
        for(int i=0;i<n;i++){
            
            Z[i] =s.nextInt();
        }
        for(int i=0;i<a;i++){
              temp = Z[0];  
            for(j=0;j<n-1;j++){
            
            Z[j] = Z[j+1];
            
            }
            Z[j]=temp;
        }
        for(j=0;j<n;j++){
        System.out.print(Z[j]+" ");
        }
    }
}
