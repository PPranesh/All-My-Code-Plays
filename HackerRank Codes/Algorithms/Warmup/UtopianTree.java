/**
 * 
 */
package UtopianTree;

/**
 * @author Pranesh
 *
 * Oct 24, 2018 - UtopianTree.java
 */

// packages to imported
import java.util.Scanner;

// main class starts here
public class UtopianTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int testCases,months;
		Scanner scan = new Scanner(System.in); 
		testCases = scan.nextInt();
		System.out.println();
		for(int i=0;i<testCases;i++) {
			months = scan.nextInt();
			System.out.print(utopianTree(months)+"\n");
		}
		scan.close();
	}
	
	static int utopianTree(int n) {
		int height=1,output;
		int[] cycles = new int[60];
		cycles[0] = 1;
		
		if(n == 0) {
			output = cycles[0];
			return output;
//			System.out.println(cycles[0]);
		}else {
			for(int i=1;i<=n;i++) {
				if(i%2 == 0) {
					height = height+1;
					cycles[i] = height;
//					System.out.println(cycles[i]);
				}else {
					height = height*2;
					cycles[i] = height; 
//					System.out.println(cycles[i]);
				}
			}
//			System.out.println(cycles[n]);
			output = cycles[n];
			return output;
//			return n;
		}
    }
}
