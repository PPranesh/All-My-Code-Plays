import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Pranesh
 */
public class DiagonalDifference {

    public static void main(String[] args) {
        // global declarations
        int arraySize,count=0;
        int row,column,total;
        
        Scanner s = new Scanner(System.in);
        arraySize = s.nextInt();
        row = arraySize;
        column = arraySize;
        int[][] a = new int[row][column];
        
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                a[i][j] = s.nextInt();
            }
        }
        
        System.out.println(diagonalDifference(a));
    }
    
            
    public static int LefttoRight(int z[][]){
            int ii = 0,jj = 0;
            boolean loopRun = true;
            int temp;
            int LefttoRightValue = 0;

            // operation starts here
            temp = z.length;
            while(loopRun){
                    int tempElement = z[ii][jj];
                    LefttoRightValue += tempElement;
                    ii = ii+1;
                    jj = jj+1;
                    --temp;
                    if(temp == 0 ){
                                loopRun = false;
                    }   
            }
            return LefttoRightValue;
        }
    
    
    public static int RighttoLeft(int z[][]){
            int ii = 0,jj = z.length-1;
            boolean loopRun = true;
            int temp;
            int RighttoLeftValue = 0;
            
            // operation starts here
            temp = z.length;
            while(loopRun){
                    int tempElement = z[ii][jj];
                    RighttoLeftValue += tempElement;
                    ii = ii+1;
                    jj = jj-1;
                    --temp;
                    if(temp == 0 ){
                                loopRun = false;
                    }   
            }
            return RighttoLeftValue;
        }
        
     // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
        int diagonalDifferenceValue;
        
        diagonalDifferenceValue = LefttoRight(arr) - RighttoLeft(arr);

    return (Math.abs(diagonalDifferenceValue));    
    }
}
