import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the chocolateFeast function below.
    static int chocolateFeast(int money, int cost, int wrappersNeeded) {
           int chocolateCount = 0,wrapper;   
        
        if (money >= cost){
            chocolateCount = money/cost;
            wrapper = chocolateCount;

            // while (wrapper >= wrappersNeeded){       
            //     wrapper = Math.round(wrapper/wrappersNeeded);
            //     chocolateCount += wrapper;
            //     wrapper -= wrapper;
            // } 

            while(wrapper >= wrappersNeeded) {
                int ex_chocs = wrapper / wrappersNeeded;
                wrapper = ex_chocs + wrapper % wrappersNeeded;
                chocolateCount += ex_chocs;
            }         
        }
        return chocolateCount;
    
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] ncm = scanner.nextLine().split(" ");

            int n = Integer.parseInt(ncm[0]);

            int c = Integer.parseInt(ncm[1]);

            int m = Integer.parseInt(ncm[2]);

            int result = chocolateFeast(n, c, m);

            System.out.println(result);
       
       
        }


        scanner.close();
    }
}
