import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Time_Conversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String[] aa = s.split("[^A-Z]+");
        String[] bb = s.split("[^0-9]+");
        String res = "";
        int rest = 0,x;
        String time= "";
        
        if (aa[1].equals("PM")) {
            rest = 12+ (Integer.parseInt(bb[0]) % 12);
            time = rest+":"+bb[1]+":"+bb[2];
            
        }else {
            x = Integer.parseInt(bb[0]) % 12;
            if (x == 0) {
                res = String.format("%02d",x);
            }else {
                res = String.format("%02d",x);
            }
            time = res+":"+bb[1]+":"+bb[2];
        }
        return time;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
