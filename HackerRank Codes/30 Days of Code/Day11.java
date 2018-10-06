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
 
public class 2D_Arrays {
    public static void main(String[] args){
        
        //initializing the array size as  6 * 6 
        int a[][] = new int[6][6];  
        
        //scanner class
        Scanner s = new Scanner(System.in);
        
        // getting the values and storing into array
        for(int i=0;i<6;i++){             
            for(int j=0;j<6;j++){
                a[i][j] = s.nextInt();
            }
        }
        
         //calls the function and stores the output in result
        int result = hourglassSum(a);    
        
        // prints the output
        System.out.println(result);         

    }
    
    //hourglass function
    static int hourglassSum(int[][] a){
        
        // initializing the max as minimum value of (-2 ^ 32)
        int max = Integer.MIN_VALUE;
        
        
        for(int i=0;i<a.length-2;i++){
            for(int j =0;j<a.length-2;j++){
        
        //adding the values and storing it in total
                int total = a[i][j]+
                          a[i][j+1]+
                          a[i][j+2]+
                          a[i+1][j+1]+
                          a[i+2][j]+
                          a[i+2][j+1]+
                          a[i+2][j+2];
                          
               // max value contains the value which is larger than total           
                max = total > max ? total : max;
            }
        }
            // returns max
            return max;
        }
}





