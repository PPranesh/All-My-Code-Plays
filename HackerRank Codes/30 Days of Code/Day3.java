import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class introToConditionalStatements {

	public static void main(String[] args) {
      	
	// scanner class
	Scanner scan = new Scanner(System.in);
      	
	// getting the inputs
	int n = scan.nextInt(); 
      	scan.close();
        
	//finds whether n is odd or even
	if(n%2==1){             
	
        	//prints output
		System.out.println("Weird");   
        }
        
	//compares from 2 to 5
	else if(n>=2 && n<=5){            
	
		//prints output
		System.out.println("Not Weird");  
	}
	
	//compares from 6 to 20
        else if(n>5 && n<=20){
	
		//prints output
        	System.out.println("Weird");       
      	}
	
        else{   
	
		//prints output
     		System.out.println("Not Weird");    
    	}
   }
}
