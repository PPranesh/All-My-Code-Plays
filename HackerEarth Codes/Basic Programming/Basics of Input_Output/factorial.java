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
public class Factorial {
    public static void main(String[] args){
        int result = 1;
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        for(int i=1;i<=N;i++)
            result = result*i;
        System.out.println(result);
    }
}



