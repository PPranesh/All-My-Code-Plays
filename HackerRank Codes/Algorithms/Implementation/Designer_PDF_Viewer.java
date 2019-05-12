/**
 * 
 */
package HackerRank_Algorithms;

/**
 * @author Pranesh
 *
 * May 12, 2019 - Designer_PDF_Viewer.java
 */
import java.util.Scanner;
public class Designer_PDF_Viewer {

	/**
	 * @param args
	 */
	public static int[] z;
	public static int c = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		int[] arr = new int[n];
		z = new int[n];
		
		for (int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		s.close();
		permutationEquation(arr);
		System.out.println("result");
		for (int i=0;i<n;i++) {
			System.out.println(z[i]);
		}
	}
	

    // Complete the permutationEquation function below.
     static int[] permutationEquation(int[] p) {
      
        int n = p.length,aa = 1,i;
        
        for (i=0;i<n;) {
            
            if (aa == p[i]) {
                SecondIndex(p,i+1);
                aa++;
                i=0;
            }else{
                i++; 
            }
        }
        return z;
    }

    
    static void SecondIndex(int[] x,int key) {
        int zz = x.length;
        for (int i=0;i<zz;i++) {
            
            if ( key == x[i] ) {
                z[c++] = i+1;
                break;
            }
        }
        
    }

}
