import java.io.*;
import java.util.*;
public class Class_vs_Instances {
    
    // global declarations
    private int age;
    
    // function that gets the age
    public Person(int initialAge) {
    	age = initialAge;
    }
    
    // function that calculate the eligibility for voting or not!!
    public void amIOld() {
        
	// if age == 0
	if(age<0){
        	
		System.out.println("Age is not valid, setting age to 0.");  
        	age = 0;
        	age =age+1;
        }
	
	
        if(age<13 && age>=1){
        	
		System.out.println("You are young.");
        }
	
	
        else if(age>=13 && age<=17){
        	System.out.println("You are a teenager.");
        }
	
        else{
        	System.out.println("You are old.");
        }
}

    public void yearPasses() {
  	    age = age+1; 
        }        
    	
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any number: ");
        int T = sc.nextInt();
	for (int i = 0; i < T; i++) {
	int age = sc.nextInt();
        Person p = new Person(age);
	p.amIOld();
	for (int j = 0; j < 3; j++) {
	p.yearPasses();
	}
	p.amIOld();
	System.out.println();
        }
	sc.close();
    }
}



