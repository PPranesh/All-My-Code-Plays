/**
 * 
 */
package AngryProfessor;

/**
 * @author Pranesh
 *
 * Oct 23, 2018 - AngryProfessor.java
 */

//packages used
import java.util.Scanner;

// main class
public class AngryProfessor {
    
    
    // Complete the angryProfessor function below.
    static String angryProfessor(int k, int[] a) {

        // globally declared variables
        int onTime=0,cameLate=0;
        
        for(int i=0;i< a.length;i++) {
            if(a[i] <= 0) {
                ++onTime;
//                System.out.println("onTime= "+onTime);
            }else {
                ++cameLate;
//                System.out.println("cameLate= "+cameLate);
            }
        }
        //System.out.println("k= "+onTime);
       // System.out.println("k= "+cameLate);
        if(k > onTime ) {
            
//            System.out.println("onTime= "+onTime);
//            System.out.println("YES");
            return "YES";
    
        }else {
            
//            System.out.println("onTime= "+onTime);
//            System.out.println("NO");
            return "NO";
        }
        
    }
    
    
    public static void main(String[] args) {
    
        // globally declared variables
        int testCase,MaxStudentsCount,MinStudentsCame;
        
        // scanner class
        Scanner s = new Scanner(System.in);
//        System.out.println("no.of testcase: ");
        testCase = s.nextInt();
        
        for(int i=0;i<testCase;i++) {
//            System.out.println("no.of students: ");
            MinStudentsCame = s.nextInt();
//            System.out.println("min students: ");
            MaxStudentsCount = s.nextInt();            // k - value
            int[] studentsTime = new int[MinStudentsCame];
            
//            System.out.println("students timing");
            for(int j=0;j<MinStudentsCame;j++) {    
                studentsTime[j] = s.nextInt();
            }
            // if(i==0) {
            //     System.out.println();                
            // }

            System.out.print(angryProfessor(MaxStudentsCount, studentsTime)+"\n");
//            angryProfessor(MaxStudentsCount, studentsTime);

        }
        
    }
}
