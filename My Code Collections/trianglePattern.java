
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pranesh
 */
public class trianglePattern {
    public static void main(String[] args){
        int n;
        Scanner d = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        RightTriangle right = new RightTriangle();
        InvertedRightTriangle inright = new InvertedRightTriangle();
        n = d.nextInt();
        right.RightTriangle(n);
        inright.InvertedRightTriangle(n); 
        d.close();
    }
}

class RightTriangle{
    
    //right angled triangle
    void RightTriangle(int n){
        for(int i=1;i<=n;i++){
            //System.out.println();
            System.out.print(i+" ");
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println("");
        }
    }
}
    
    
class InvertedRightTriangle{

    //inverted right angled triangle        
    void InvertedRightTriangle(int n){
        for(int i=n;i>=1;i--){
            System.out.println();
            System.out.print(i+" ");
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
        }
    System.out.println("");
    }
}
