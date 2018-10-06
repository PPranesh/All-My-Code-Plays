/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pranesh
 */
 
 //import packages
import java.util.Scanner;

// main class
public class LifeUniverseEverything {
    
    // main function
    public static void main(String args[] ) throws Exception {
       int i;
       Scanner in=new Scanner(System.in);
       
       // gets the input until last input
       while(in.hasNext()){
          i=in.nextInt();
          
          // prints until input equals 42
          if(i!=42){
            System.out.println(i);
          }else{
            
            // breaks the while loop
            break;  
          }
       }
    }
}
