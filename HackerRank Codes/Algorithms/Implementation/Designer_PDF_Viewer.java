//package HackerRank_Algorithms;

import java.util.Scanner;

public class Designer_PDF_Viewer { 
    public static void main(String[] args) { 
    
    	int arr[] = new int[26];
    	
    	Scanner s = new Scanner(System.in);
    	
    	for (int i=0;i<26;i++) {
    		arr[i] = s.nextInt();
    	}
    	String str = s.next();
    	s.close();
    	
    	System.out.println(designerPdfViewer(arr,str));
    	
    } 
    
    static int designerPdfViewer(int[] h, String word) {
    	int n = word.length(),max=0,result;
    	char[] LowerCases= new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        
    	 for (int i=0;i<n;i++) {
             
             for (int j=0;j<26;j++) {
                 
                 if ( word.charAt(i) == LowerCases[j] ) {
                 	max = Math.max(max, h[j]);
                    break;
                 }
             }    
    	 }
    	 result = n*max;
    	 
        return result;
    }  
}
