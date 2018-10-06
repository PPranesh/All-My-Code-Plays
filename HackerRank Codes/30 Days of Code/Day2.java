import java.util.*;
import java.math.*;

public class Operators { 

    public static void main(String[] args) {
    
    // scanner class
    Scanner scan = new Scanner(System.in);
    
    // getting the inputs
    double mealCost = scan.nextDouble(); // original meal price
    double tipPercent = scan.nextInt(); // tip percentage
    double taxPercent = scan.nextInt(); // tax percentage
    scan.close();
    
    // calculating the values
    tipPercent =(double) (mealCost*(tipPercent/100));  
    taxPercent =(double)(mealCost*(taxPercent/100)); 
    double total = (mealCost+tipPercent+taxPercent); 
    
    //converting the decimal into integer using the math formula 
    int totalCost =  (int) Math.round(total);  
    
     // Printing your result
    System.out.println("The total meal cost is "+totalCost+ " dollars."); 
    }
}


