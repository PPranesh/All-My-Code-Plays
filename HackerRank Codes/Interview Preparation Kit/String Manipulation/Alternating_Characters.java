/**
 * 
 */
package HackerRank_Algorithms;

/**
 * @author Pranesh
 *
 * May 27, 2019 - Alternating_Characters.java
 */
import java.util.Scanner;
public class Alternating_Characters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		for (int i=0;i<n;i++) {
			System.out.println(alternatingCharacters(s.next()));
		}
		s.close();
	}
	
	static int alternatingCharacters(String s) {
		
		int len = s.length(),removeChars=0;
		char[] arr = s.toCharArray();
		
		for (int i=0;i<len-1;) {
			if (arr[i] == arr[i+1]) {
				removeChars++;
				i++;
			} else {
				i++;
			}
		}
		return removeChars;
    }

}
