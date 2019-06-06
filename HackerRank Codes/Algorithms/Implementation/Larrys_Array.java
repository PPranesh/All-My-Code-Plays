package HackerRank_Algorithms;

/**
 * @author Pranesh
 *
 * May 16, 2019 - Larrys_Array.java
 */
import java.util.Scanner;

public class Larrys_Array {

    public static void main(String[] args) {
       
    	
        Scanner s = new Scanner(System.in);
        int c  = s.nextInt();
        
        while (c > 0){

        	int length = s.nextInt();
        
            int[] array = new int[length];
        
            for (int i=0;i<length;i++) {
                array[i] = s.nextInt();
            }
        
            larrysArray(array,length);
            --c;

        }
        s.close();
    }
        
    static void larrysArray(int[] array,int length) {

        int key = 1,i,flag = 0;



        for (i=0;i<length;) {

            if ( array[i] == key ) {

                i++;
                key++;

            } else {
                 
                if (!(rotate(array,i,key,length))) {
                	flag = 0;
                	break;
                	
                } else {
                	flag = 1;
                  i++;
                }

            }
            
        }
        
        if (flag == 1) {
        	System.out.println("YES");
        } else {
        	System.out.println("NO");
        }
    
    }
    
    
    static boolean rotate (int[] array,int startIndex,int key,int length) {
    
        if ( ( length - startIndex) >= 3  ) {
            
            if (array[startIndex +2] == key){
            	
                rotatedIfLast (array,startIndex);
                
            } else if ( (array[startIndex +1] == key) ) {

            	rotatedIfMidlle (array,startIndex);
            	
            } else {

                if (startIndex+1 == length-1) {
                	return false;
                } else {
                	rotate (array,startIndex+1,key,length);
                }

            }
            return true;
            
        } else {

        	return false;
        	
        }
    }
    
    static void rotatedIfLast(int[] arr,int z) {
        int a,b,c;
        
        a=arr[z];
        b=arr[z+1];
        c=arr[z+2];
        
        arr[z] = b;
        arr[z+1] = c;
        arr[z+2] = a;
        
    }    
    
    static void rotatedIfMidlle(int[] arr,int z) {
        int a,b,c;
        
        a=arr[z];
        b=arr[z+1];
        c =  arr[z+2];
        
        arr[z] = b;
        arr[z+1] = c;
        arr[z+2] = a;
    }  
    
}
