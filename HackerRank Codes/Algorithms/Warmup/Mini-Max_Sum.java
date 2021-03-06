import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Mini-Max_Sum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        long max=0,min=0;
        Arrays.sort(arr);
        int len = arr.length-1;

        for (int i=0;i<len;i++){
            min += arr[i];
            max += arr[i+1];
        }
        System.out.print(min+" "+max);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
