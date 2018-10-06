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
public class Roy_and_Profile_Picture {
    public static void main(String[] args){
        int L,N;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the L: ");
        L = s.nextInt();
        System.out.println("Enter the number of shirts: ");
        N = s.nextInt();
        int[] W = new int[N];
        int[] H = new int[N];
        for(int i=0;i<N;i++){
            W[i] = s.nextInt();
            H[i] = s.nextInt();
        }
        s.close();
        profile_is_selected(L,W,H,N);     
    }
    
    static void profile_is_selected(int L,int W[],int H[],int N){
        for(int i=0;i<N;i++){
            if(W[i]>=L && H[i]>=L){
                if(W[i] == H[i]){
                    System.out.println("ACCEPTED");
                }
                else{
                    System.out.println("CROP IT");
                }
            }
            else{
                System.out.println("UPLOAD ANOTHER");
            }
        }
        }
}
