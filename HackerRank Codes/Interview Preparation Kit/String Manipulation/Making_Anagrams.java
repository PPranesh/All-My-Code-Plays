/**
 * 
 */
package HackerRank_Algorithms;

import java.util.Scanner;

/**
 * @author Pranesh
 *
 * May 13, 2019 - Making_Anagrams.java
 */
public class Making_Anagrams {

	/**
	 * @param args
	 */
public static void main(String[] args) { 
    	
    	String a,b;
    	
    	Scanner s = new Scanner(System.in);
    	
    	a = s.nextLine();
    	b = s.nextLine();
    	
    	System.out.println(makeAnagram(a,b));
    	
    }
    
    static int makeAnagram(String a, String b) {

    	int[] aa = getCharCount(a);
    	int[] bb = getCharCount(b);
    	return getDelta(aa,bb);
    }
    
    static int[] getCharCount(String a) {
    	
    	int[] z = new int[26];
    	for (int i=0;i<a.length();i++) {
    		char ch = a.charAt(i);
    		int aa = (char)'a';
    		int m = ch - aa;
    		z[m]++;	
    	}
    	return z;
    }
    
    static int getDelta(int[] aa,int[] bb) {
    	
    	if (aa.length != bb.length) {
    		return -1;
    	}else {
    		int count = 0;
        	for (int i=0;i<aa.length;i++) {
        		int diff = Math.abs(aa[i] - bb[i]);
        		count += diff;
        	}
        	return count;
    	}
    }
}
    
