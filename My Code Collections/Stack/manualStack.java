/**
 * 
 */
package Stacks;

/**
 * @author Pranesh
 *
 * Jul 21, 2019 - manualStack.java
 */
import java.util.*;
public class manualStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		Stack stack = new Stack();
		boolean run = true;
		
		System.out.println("1.push\t2.pop\t\t3.peek\n4.size\t5.isEmpty\t6.Show");
		while(run) {
			System.out.println("\nwaiting!");
			int c = s.nextInt();
			
			switch(c) {
				case 1: 
					int data = s.nextInt();
					stack.push(data);
					break;
				
				case 2 : 
					stack.pop();
					break;
					
				case 3: 
					System.out.println("\nPeek: "+stack.peek());
					break;
					
				case 4: 
					System.out.println("\nSize: "+stack.size());
					break;
					
				case 5: 
					System.out.println("\nEmpty: "+stack.isEmpty());
					break;
					
				case 6: 
					stack.show();
					break;
					
				default:
					run = false;
					break;
			}
			
		}
		s.close();
	}
}

class Stack {
	
	static List<Integer> stack = new ArrayList<>();
 	static int top;
	
	void push(int data) {
		
		stack.add(data);
		top++;
	}
	
	void pop() {
		
		if (top == 0) {
			System.out.println("stack is empty!");
		} else {
			top--;
			stack.remove(top);
//			System.out.println("stack is empty!");
		}
	}
	
	int peek() {
		
		if (top == 0) {
			return -1;
		} else {
			return stack.get(top-1);
		}
	}
	
	void show() {
		
		if (stack.isEmpty()) {
			System.out.print("Stack is Empty!!");
		} else {
			System.out.print("\nStack: ");
			for(int n : stack) {
				System.out.print(n+" ");
			}
		}
		
	}
	
	boolean isEmpty() {
		if (top == 0) {
			return true;
 		} else {
 			return false;
 		}
	}
	
	int size() {
		return top;
	}
	
	
}
