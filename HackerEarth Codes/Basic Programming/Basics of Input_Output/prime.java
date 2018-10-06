import java.util.Scanner;
public class prime{
	
	public static void main(String[] args){
	int total; 
	
	//Scanner class
	//System.out.println("Enter the last number");
	Scanner s = new Scanner(System.in);
	total = s.nextInt();		//getting the last number
	
	for(int i = 2 ; i <= total ; i++ ){
	
		int temp;     
		boolean isPrime = true;
		
		for(int j=2;j<=i/2;j++){
	
	        temp = i%j;
	        if(temp ==0){     //if true returns false else true
	                isPrime = false;
	                break;
	        }                   
	   }
	   if(isPrime == true){
	      System.out.print(i+" ");        //displays the outpur as -  2 3 5  
	   }   			
	}	
	}
}
