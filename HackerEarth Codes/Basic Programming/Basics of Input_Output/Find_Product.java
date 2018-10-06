/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pranesh
 */

import java.util.Scanner;
public class Find_Product {
    
    // main function
    public static void main(String[] args){
    
        // global declarations    
        long res = 1;
        
        // scanner class
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] a = new int[N];

        for(int i=0;i<N;i++)
        {
        
            // stores the inputs in an array
            a[i]= s.nextInt();
            
            // calculates the result based upin the formula  =>  (1*a[i])%(int)(Math.pow(a,b)+7);   ==>>  (a^b)
            res = (res*a[i])%(int)(Math.pow(10,9)+7);
        }
        
        // displays the output
        System.out.println(res);
    }
}
