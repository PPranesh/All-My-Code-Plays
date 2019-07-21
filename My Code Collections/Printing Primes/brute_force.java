/**
 * 
 */

/**
 * @author Pranesh
 *
 * Jul 17, 2019 - brute_force.java
 */
import java.util.*;
public class brute_force {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s = new Scanner(System.in);	
		System.out.println("enter a number: ");
		n = s.nextInt();
		s.close();
		if (isPrime(n)) {
			System.out.println("prime"); 
		} else {
			System.out.println("not prime");
		}
		
	}
	
	static boolean isPrime(int n) {
		
		if (n <= 1) 
			return false;
		
		for (int i=2;i<n;i++) {
			if (n % i == 0) {
				return false;
			}
		}
		
		return true;
		
	}

}
