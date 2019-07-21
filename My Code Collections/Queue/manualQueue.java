/**
 * 
 */
package Queue;

/**
 * @author Pranesh
 *
 * Jul 21, 2019 - manualQueue.java
 */
import java.util.*;

public class manualQueue {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		Queue q = new Queue();
		boolean run = true;
		
		System.out.println("1.EnQueue\t2.DeQueue\t3.peek\n4.size\t\t5.isEmpty\t6.Show");
		while(run) {
			System.out.println("\nwaiting!\n");
			int c = s.nextInt();
			
			switch(c) {
				case 1: 
					int data = s.nextInt();
					q.enQueue(data);
					break;
				
				case 2 : 
					System.out.println("\nDeQueue: "+q.deQueue());
					break;
					
				case 3: 
					System.out.println("\nPeek: "+q.peek());
					break;
					
				case 4: 
					System.out.print("Size: "+q.getSize());
					break;
					
				case 5: 
					System.out.println("\nEmpty: "+q.isEmpty());
					break;
					
				case 6: 
					q.show();
					break;
					
				default:
					run = false;
					break;
			}
			
		}
		s.close();
	}
}


class Queue {
	
	static List<Integer> queue = new ArrayList<>();
	static int size,front=0,rear;
	
	public void enQueue(int data) {
		
		queue.add(data);
		size++;
		rear++;
	}
	
	public int getSize() {
		return size;
	}
	
	public int deQueue() {
		
		if (isEmpty()) {
			System.out.print("Queue is empty!!");
			return -1;
		} else {
			size--;
			rear--;
			return queue.remove(front);
		}
		
	}
	
	public void show() {
		System.out.print("Queue: ");
		for (int i : queue) {
			System.out.print(i+" ");
		}
	}
	
	public int peek() {
		
		if (!isEmpty()) {
			return queue.get(rear-1);
		} else {
			return -1;
		}
		
	}
	
	public boolean isEmpty() {
		
		if (size == 0) {
			return true;
		} else {
			return false;
		}
		
	}
	
}
