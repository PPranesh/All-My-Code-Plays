import java.util.*;

/**
 *
 * @author Pranesh
 */
public class PlusMinus {
    public static void main(String[] args){

    // global declarations
        int arraySize;

        Scanner s = new Scanner(System.in);
        arraySize = s.nextInt();
        int[] signArray = new int[arraySize];
        for(int i=0;i<arraySize;i++){
            signArray[i] = s.nextInt();
        }

        plusMinus(signArray);
    }


    static void plusMinus(int[] arr) {
        // global declarations
        double positive = 0, negative = 0, zero = 0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] > 0){
                ++positive;
            }else if(arr[i] < 0){
                ++negative;
            }else{
                ++zero;
            }
        }
        positive = positive / arr.length;
        negative = negative / arr.length;
        zero = zero / arr.length;
        System.out.format("%.6f\n",positive);
        System.out.format("%.6f\n",negative);
        System.out.format("%.6f\n",zero);
    }      
}
