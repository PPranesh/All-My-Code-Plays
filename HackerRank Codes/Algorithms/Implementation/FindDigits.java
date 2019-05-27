/**
 * 
 */
package HackerRank_Algorithms;

/**
 * @author Pranesh
 *
 * May 27, 2019 - FindDigits.java
 */
import java.util.Scanner;
public class FindingDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		for (int i=0;i<n;i++) {
			System.out.println(findDigits(s.nextInt()));
		}
		s.close();
	}
	
	
	static int findDigits(int n) {
		
		int value=1,rem,count=0,number=n;
		while ( n != 0) {
			
			value = n % 10;
			
			if ( value > 0 ) {
				
				rem = number % value;
				
				if (rem == 0) {
					count++;
				} else {

				}
			}
			
 			n = n / 10;
		}
		return count;
    }

}
