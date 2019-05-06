/**
 * 
 */

/**
 * @author Pranesh
 *
 * May 5, 2019 - Climbing_the_Leaderboard.java
 */
//import java.util.stream.*;
import java.util.Scanner;
public class Climbing_the_Leaderboard {

  /**
   * @param args
   */
  static int[] ranking;
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int scores , alices;
    Scanner s = new Scanner(System.in);
    
    scores = s.nextInt();
    
    int[] score = new int[scores];
    for (int i=0;i<scores;i++) {
      score[i] = s.nextInt();
    }
    
    alices = s.nextInt();
    int[] alice = new int[alices];
    
    for (int i=0;i<alices;i++) {
      alice[i] = s.nextInt();
    }
    
    ranking = climbingLeaderboard(score,alice);
    for (int i=0;i<alices;i++) {
      System.out.println(ranking[i]);
    }
    s.close();

  }
  
  static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] array = RemoveDuplicates(scores);
        int length = array.length-1,i=0;
        ranking = new int[alice.length];

        for (int score:alice) {
          while (length >= 0) {
            if (score >= array[length]) {
              length--;
            }else {
              ranking[i++] = length+2;
              break;
            }
          }
          if (length < 0) {
            ranking[i++] = 1;
          }
        }
      return ranking;
      }
    
  static int[] RemoveDuplicates(int[] ar) {
    int n = ar.length,j=0;
    int arr[] = new int[n];
    
    for (int i=0;i<n-1;i++) {
      if (ar[i] != ar[i+1]) {
        arr[j++] = ar[i];
      }
    }
    arr[j++] = ar[n-1];  
    return arr;
  }
}
