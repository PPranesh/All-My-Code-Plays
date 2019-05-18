/**
 * 
 */
package Trees;

/**
 * @author Pranesh
 *
 * May 18, 2019 - Node.java
 */


//Node Class
public class Node {
	
	Node left,right;
	int data;
	
	public Node(int value) {
		this.data = value;
		left = right = null;
	}
	
	public Node() {
		
	}
	
//		Insert Value
	public void insertData(int value) {
		
		
		if ( value <= data ) {
			if ( left == null ) {
				left = new Node(value);
			} else {
				left.insertData(value);
			}
		} else {
			if ( right == null ) {
				right = new Node(value);
			} else {
				right.insertData(value);
			}	
		}
		
	}
		
//		print In-Order
	public void printInOrder() {
	
		if ( left != null ) {						
			left.printInOrder();
		}
			
		System.out.print(data+" ");

		if (right != null) {
			right.printInOrder();
		}
			
	}
	
  //		print Pre-Order
	public void printPreOrder() {
		
		System.out.print(data+" ");
		
		if ( left != null ) {
			left.printPreOrder();
		}
		
		if ( right != null ) {
			right.printPreOrder();
		}
		
	}
	
  //		print Post-Order
	public void printPostOrder() {
		
		if ( left != null ) {
			left.printPostOrder();
		} 
		
		if ( right != null ) {
			right.printPostOrder();
		}
		
		System.out.print(data+" ");
	}
	
  //		check if value is present or not
	public boolean Contains(int value) {
		
		if ( value == data ) {
			return true;
		} else if ( value <= data ) {
			
			if ( left != null ) {
				return left.Contains(value);
			} else {
				return false;
			}
			
		} else {
			
			if ( right != null ) {
				return right.Contains(value);
			} else {
				return false;
			}
	
		}	
	}
  
}
