/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pranesh
 */
import java.io.*;
import java.util.*;
public class TwoStrings {
    public static void main(String[] args){
        String str1,str2;
        int next=0,stop=0,N;
        Scanner s = new Scanner(System.in);
        N = s.nextInt();
        for(int testCase=0;testCase<N;testCase++){
            str1 = s.next();
            str2 = s.next();
            char arr1[] = str1.toCharArray();
            char arr2[] = str2.toCharArray();
            for(int i=0;i<arr1.length;i++){
                for(int j=i;j<arr2.length;j++){
                    if(arr1[i] == arr2[j]){
                        next = 1;
                        arr1[i] = '/';
                        arr2[j] = '/';
                        System.out.println("one");
                    }
                if(next==1){
                    next = 0;
                    continue;
                }else{
                    break;
                }
                }
                
            }
            str1 = String.valueOf(arr1);
            str1 = str1.replace("/", "");
            str2 = String.valueOf(arr2);
            str2 = str2.replace("/","");
            if(str1.length()==0 && str2.length()==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

            System.out.println("Output:");
            System.out.println(str2);
            System.out.println();
            System.out.println(Arrays.toString(arr1));
            System.out.println(Arrays.toString(arr2));
        }
    }
}
