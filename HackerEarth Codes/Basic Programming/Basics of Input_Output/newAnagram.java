/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pranesh
 */


import java.util.*;
public class newAnagram {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        int N = s.nextInt();
        for(int q=1;q<=N;q++){
            int eq=0;
            String a = s.next();
            String b = s.next();
            int n1 = a.length();
            int n2 = b.length();
            char[] aa = a.toCharArray();
            char[] bb = b.toCharArray();
            for(int i=0;i<n1;i++){
                for(int j=0;j<n2;j++){
                    if(aa[i] == bb[j]){
                        eq++;
                        bb[j]='0';
                        break;
                    }
                }
            }
        // finding total
            int total = n1+n2-(2*eq);
            System.out.println(total);
        }
    }
}
