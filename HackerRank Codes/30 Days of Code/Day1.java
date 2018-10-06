import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class dataTypes {
	
        public static void main(String[] args) {
    
    	// decalre globally
	int i = 4;
	double d = 4.0;
	String s = "HackerRank ";
	
	// scanner class
	Scanner scan = new Scanner(System.in);
	
	// getting the inputs
	int a = scan.nextInt(); 
	double b = scan.nextDouble();
	scan.nextLine();                          	
	String c = scan.nextLine();
	
	// prints the outputs
	System.out.println(i + a);
	System.out.println(d + b);
	System.out.println(s + c);
	scan.close();
    }
}
