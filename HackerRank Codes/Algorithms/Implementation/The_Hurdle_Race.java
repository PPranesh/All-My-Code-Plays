/**
 * 
 */

/**
 * @author Pranesh
 *
 * May 5, 2019 - The_Hurdle_Race.java
 */
import java.util.Scanner;
import java.util.Arrays;
public class The_Hurdle_Race {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,max;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		max = s.nextInt();
		
		int arr[] = new int[n];
		for (int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		s.close();
		System.out.println(hurdleRace(max,arr));
		
	}
	
	static int hurdleRace(int k, int[] height) {

		Arrays.sort(height);
		int n = height.length;
		if (k > height[n-1]) {
			return 0;
		}else {
			return Math.abs(k-height[n-1]);
		}
    }
	
}
