/**
 * 
 */

/**
 * @author Pranesh
 *
 * May 5, 2019 - Cats_and_a_Mouse.java
 */
import java.util.Scanner; 
public class Cats_and_a_Mouse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x,y,z,n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		for(int i=0;i<n;i++) {
			x = s.nextInt();
			y = s.nextInt();
			z = s.nextInt();
			System.out.println(catAndMouse(x,y,z));
			
		}
		s.close();
	}
	
	public static String catAndMouse(int x,int y,int z) {
		if (x >= z || y >= z) {
			int Cat_A = CaughtOrNot(z,x);
			int Cat_B = CaughtOrNot(z,y);
			String res =  toCompete(Cat_A,Cat_B);
			return res;
		}else {
			int Cat_A =  CaughtOrNot(x,z);
			int Cat_B = CaughtOrNot(y,z);
			String res =  toCompete(Cat_A,Cat_B);
			return res;
		}
		
	}
	
	public static String toCompete(int a,int b) {
		if (a == b) {
			return "Mouse C";
		}else if ( a > b) {
			return "Cat B";
		}else {
			return "Cat A";
		}
	}
	
	public static int CaughtOrNot(int start, int end) {
		int count=0;
		if( start > end ) {
			for (int i=start;i>= end;i--) {
				 count++;
			}
		}else {
			for (int i=start;i<= end;i++) {
				 count++;
			}
		}
		return count;
	}
	

}
