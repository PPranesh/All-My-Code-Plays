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
public class CountDivisors {
    public static void main(String[] args){
        int a =0;
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        int r = s.nextInt();
        int k = s.nextInt();
        for(int i=l;i<=r;i++){
            if(i%k == 0)
                a++;
        }
        System.out.println(a);
    }
}
