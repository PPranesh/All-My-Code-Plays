
import java.util.*;
public class Stack_Queue { 
	
	
	/*	geeks_for_geeks link :)
	  
	   "https://www.geeksforgeeks.org/check-queue-can-sorted-another-queue-using-stack/"
	
	 */
	
	
	static Queue<Integer> q = new LinkedList<>();
    public static void main(String[] args) {
    	
//    	positive test_case
	    	q.add(5); 
	        q.add(1); 
	        q.add(2); 
	        q.add(3); 
	        q.add(4); 
    	
//        negative test_case
//	        q.add(5); 
//	        q.add(1); 
//	        q.add(2);
//	        q.add(6);
//	        q.add(3); 
//	        q.add(4); 
        
        
    	int n=q.size();
    	if (findIsPossible(n)) {
    		System.out.println("true");
    	} else {
    		System.out.println("false");
    	}
    }
    
    static boolean findIsPossible(int n) {
    	
    	Stack<Integer> st = new Stack<>();
    	int front,exp = 1;
    	
//    	egg. 5 1 2 3 4  gives true
//    	egg. 5 1 2 6 3 4  gives false    	 
    	
    	while(q.size() != 0) {
    		
    		front = q.poll();
    		
    		if (exp == front) {
    			exp++;

    		} else {
    			
    			if (st.empty()) {
    
    				st.push(front);
    				
    			} else if ( (st.size() != 0) && (st.peek() < front) ){
    				
            /* stack not empty && stack's front < front
    				Egg. 5 < 1
    				 	 6 < 3
    				 */
             
    				return false;
    				
    			} else {
    				st.push(front);
    			}
    			
    		}
    		
    		while (st.size() != 0 && st.peek() == exp) {
    		
    			// checks stack's top equals expected
    			exp++;
    			st.pop();	//	deletes stack's top
    			
    		}
    	}
    	
    	if ( (exp-1 == n) && (st.size() == 0) )
    		return true;
    	else 
    		return false;	
	}	
}
