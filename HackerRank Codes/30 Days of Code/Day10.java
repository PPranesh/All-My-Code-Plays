/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pranesh
 */

import java.util.Scanner;

public class binaryNumbers {
     public static void main (String[] args)
    {
      int a,b=0,c=0;
      String k="";
      Scanner in=new Scanner(System.in);
      a=in.nextInt();
      while(a>1)
      {
          k=(char) a%2 +k;
          a=a/2;
      }
       k=a+k;
        //System.out.println(k);
       for(int l=0;l<k.length();l++)
       {
           if(k.charAt(l)=='1')
               b++;
           else{
               if(b>c){
                   c=b;
                }
                b=0;
           }
       }
       System.out.println(c);
    }
}





