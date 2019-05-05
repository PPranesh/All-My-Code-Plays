import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
    boolean flag = false;
    
    if (year % 4 ==0 ) {
      if (year % 100 ==0 && year>=1919) {
        
        if (year %400 ==0) {
          flag = true;
        }else {
          flag = false;
        }
      }else {
        flag = true;
      }
    }
  
    if ( !(flag) && (year ==1918) ) {
      String ss = "26.09."+year;
      return ss;
    }else if(flag){
      String ss = "12.09."+year;
      return ss;
    }else {
      String ss = "13.09."+year;
      return ss;
    }
    
  }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}