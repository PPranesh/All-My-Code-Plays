package ProblemSolving.Arrays;

/**
 *
 * @author Pranesh
 */

import java.util.*;

public class SparseArrays {
    public static void main(String[] args){
        
        // global declarations
        int totalStrings,totalQueries;
        
        // scanner class
        Scanner s = new Scanner(System.in);
        
        // getting the string count
        totalStrings = s.nextInt();
        String[] strings = new String[totalStrings];
        
        // getting the strings and storing into string arrays
        for(int i=0;i<totalStrings;i++){
            strings[i] = s.next();
         }

        // getting the query count
        totalQueries = s.nextInt();
        String[] queries = new String[totalQueries];
        
        // getting the query and storing into query arrays
        for(int i=0;i<totalQueries;i++){
            queries[i] = s.next();
        }
        
        // initializing the print array size
        int[] print = new int[totalQueries];
        
        /* getting the return matchingStrings array and 
        storing into print array    */
        // calling the matchingStrings function
        print = matchingStrings(strings,queries);
        for(int i=0;i<totalQueries;i++){
            
            // displays the final output
            System.out.println(print[i]);
        }
    
    }
    
    
    // matchingStrings function
    static int[] matchingStrings(String[] string, String[] query) {
        
        // global declarations
        int[] result = new int[query.length];
        
        // for calculating the equal value count
        int equal=0;
        
        // loops used to find the equal items
        for(int i=0;i<query.length;i++){   
            for (String string1 : string) {
                if (query[i].equals(string1)) {
                    equal++;
                } else {
                }
            }
            result[i] = equal;
            equal = 0;
        }     
        
    // returns the result array
    return result;
    }
}
