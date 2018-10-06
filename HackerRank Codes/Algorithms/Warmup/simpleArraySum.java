import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class simpleArraySum {
  
  // main function starts here
  public static void main(String[] args){
    int n,sum=0;
    Scanner s = new Scanner(System.in);
    n = s.nextInt();
    int ar[] = new int[n];
    for(int i=0;i<n;i++){
      ar[i] = s.nextInt();
    }
    for(int i=0;i<n;i++){
      sum += ar[i];
    }
    System.out.print(sum);
  }
}
