/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SolveMeFirst;

// imported packages
import java.util.*;

/**
 *
 * @author Pranesh
 */

public class SolveMeFirst {


    static int solveMeFirst(int a, int b) {
        int add;
        add = a + b;
        return add;
   }

 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
   }
}
