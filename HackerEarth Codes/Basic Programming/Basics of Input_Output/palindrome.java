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
class TestClass {
    public static void main(String args[] ) throws Exception {
    String a;
    int yes=0;
    Scanner s = new Scanner(System.in);
    a = s.next();
    char[] z = new char[a.length()];
    z = a.toCharArray();
    for(int i=0;i<a.length();i++){
        for(int j=a.length()-1;j>=0;j--){
            if(z[i] == z[j])
                yes = 1;
            else
                yes = 0;
        }
    }
    if(yes == 1)
        System.out.println("YES");
    else
        System.out.println("NO");
    }
}


