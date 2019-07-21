/**
 * 
 */

/**
 * @author Pranesh
 *
 * Jul 17, 2019 - UpgradedSchoolMethod.java
 */
import java.util.*;
public class UpgradedSchoolMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		s.close();
		if (isPrime(n)) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
		
	}
	
	static boolean isPrime(int n) {
		
		if (n <= 1) {
			return false;
		}
		
		if (n <= 3) {
			return true;
		}
		
		if (n % 2 == 0 || n % 3 == 0) {
			return false;
		}
		
		for (int i=5;i*i <= n;i=i+6) {
			if (n%i == 0 || n%(i+2) == 0) {
				return false;
			}
		}
		
		return true;
	}

}
