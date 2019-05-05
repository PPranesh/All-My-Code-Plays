/**
 * 
 */

/**
 * @author Pranesh
 *
 * May 1, 2019 - ElectronicsShop.java
 */
import java.util.Arrays;
import java.util.Scanner;
public class Electronics_Shop {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k,u,b;
		Scanner s = new Scanner(System.in);
  	System.out.println("enter amount: ");
		b = s.nextInt();
		System.out.println("enter no.of Keyboards models: ");
		k = s.nextInt();
  	System.out.println("enter no.of USB models: ");
		u = s.nextInt();
		int key_boards[] = new int[k];
		int usb[] = new int[u];
		System.out.println("enter keyboard rates: ");
		for(int i=0;i<k;i++) {
			key_boards[i] = s.nextInt();
		}
		System.out.println("enter USB rates: ");
		for(int i=0;i<u;i++) {
			usb[i] = s.nextInt();
		}
		
		s.close();
		System.out.println("result: "+getMoneySpent(key_boards,usb,b));
		System.out.println("min value: "+Integer.MIN_VALUE);
	}
	
	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int temp=-1,max=-1;
		int k = keyboards.length;
		Arrays.sort(keyboards);
		Arrays.sort(drives);
		System.out.println(Arrays.toString(keyboards));
		System.out.println(Arrays.toString(drives));
		int u = drives.length; 
        for(int i=0;i<k;i++) {
        	for(int j=0;j<u;j++) {
        		
        		if ((keyboards[i]+drives[j] >= 0) && (keyboards[i]+drives[j] <= b)) {
        			System.out.println("temp: "+temp);
        			temp = keyboards[i]+drives[j];
        			max = temp >= max ? temp : max;
        			System.out.println("max: "+max);
        		}
        	}
        }
        return max;
	}
}
        
