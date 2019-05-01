import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the gradingStudents function below.
     */
    static int[] gradingStudents(int[] grades) {
        /*
         * Write your code here.
         */
        int i=0;
        int[] mul_5 = new int[20];
        int len=grades.length;
        int[] new_grd = new int[len];
        
        while( i != 19) {
            mul_5[0] = 5;
            ++i;
            mul_5[i] = mul_5[i-1]+5;
        }
        
        
        for (int s=0,j=0;s<len;s++) {
            int value=0;
            for (int q=0;q<20;q++) {
            
                if ( mul_5[q] >= grades[j]) {
                    value = mul_5[q];
                    break;
                }
                
            }
            
            if ((grades[s] >= 38) && ((value - grades[s]) < 3)) {
                new_grd[s] = value;
            }else {
                new_grd[s] = grades[s];
            }
            
        ++j;    
        }
        return new_grd;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write("\n");
            }
        }

        bw.newLine();

        bw.close();
    }
}
