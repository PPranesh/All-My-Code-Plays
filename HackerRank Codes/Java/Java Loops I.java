import java.io.*;
import java.util.*;
public class JavaLoops_I {
    public static void main(String[] args) {
      int N;
      Scanner s = new Scanner(System.in);
      N = s.nextInt();
      for(int i=1;i<=10;i++){
        System.out.println(N+" x "+i+" = "+N*i);
      }
    }
}



