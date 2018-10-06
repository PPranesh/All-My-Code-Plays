import java.util.*;
public class aVeryBigSum {

   // function that calculates the sum of long values in array
    static long aVeryBigSum(long ar[],int a) {
        long sum=0;
        for(int i=0;i<a;i++){
            sum += ar[i];
        }
        
        // returns the sum
        return sum;
    }

  // main function
  public static void main(String[] args){
        int a;
        
        // scanner class
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        long[] ll = new long[a];
        for(int i=0;i<a;i++){
          
          // stores the long values in long array
          ll[i] = s.nextLong();
        }
        
        // stores the sum value in result
        Long result = aVeryBigSum(ll,a);
        
        // displays the output
        System.out.println(result);
    }
}
