
import static java.lang.Integer.max;
import java.util.Scanner;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class 2D_Array_DS {
    public static void main(String[] args){
        int a[][] = new int[6][6];
        Scanner s = new Scanner(System.in);
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                a[i][j] = s.nextInt();
            }
        }
        int result = hourglassSum(a);
        System.out.println(result);
    }
    static int hourglassSum(int[][] a){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<a.length-2;i++){
            for(int j =0;j<a.length-2;j++){
                
                int total = a[i][j]+
                          a[i][j+1]+
                          a[i][j+2]+
                          a[i+1][j+1]+
                          a[i+2][j]+
                          a[i+2][j+1]+
                          a[i+2][j+2];
                max = total > max ? total : max;
            }
        }
            return max;
        }
}
