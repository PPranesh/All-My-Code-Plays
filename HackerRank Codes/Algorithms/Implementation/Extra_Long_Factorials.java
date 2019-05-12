/**
 * 
 */
package HackerRank_Algorithms;

import java.math.BigInteger;
/**
 * @author Pranesh
 *
 * May 12, 2019 - Extra_Long_Factorials.java
 */
import java.util.Scanner;
public class Extra_Long_Factorials {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s = new Scanner (System.in);		
		n = s.nextInt();
		s.close();
		factorial(n);

	}
	
	public static void factorial(int n) {
//		BigInteger a;
		BigInteger f = BigInteger.ONE;
		
		for (int i=n;i>0;i--) {
			f = f.multiply(BigInteger.valueOf(i));
			System.out.println(f);
		}

//	    System.out.println(f);
	}

}
