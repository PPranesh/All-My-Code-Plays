import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Loops {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();                                   //stores the table number in n
        for(int i=1;i<=10;i++){                                 //increments the table using for loop
        int result= n*i;                                        //stores the value of result
        System.out.println(n+ " x "+i+" = " +result);           //prints the output value
        in.close();
        }
    }
}
