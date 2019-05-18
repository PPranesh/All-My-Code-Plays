package Trees;

/**
 * @author Pranesh
 *
 * May 18, 2019 - MyTree.java
 */
import java.util.Scanner;
public  class MyTree {

//	private Node Class
	private static class Node {
		
		private Node left,right;
		int data;
		
		private Node(int value) {
			this.data = value;
			left = right = null;
		}
		
		private Node() {
			
		}
		
//		Insert Value
		private void insertData(int value) {
			
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
			
//		print In-Order Traversal
		private void printInOrder() {
		
			if ( left != null ) {						
				left.printInOrder();
			}
				
			System.out.print(data+" ");

			if (right != null) {
				right.printInOrder();
			}
				
		}
		
//		print Pre-Order Traversal
		private void printPreOrder() {
			
			System.out.print(data+" ");
			
			if ( left != null ) {
				left.printPreOrder();
			}
			
			if ( right != null ) {
				right.printPreOrder();
			}
			
		}
		
//		print Post-Order Traversal
		private void printPostOrder() {
			
			if ( left != null ) {
				left.printPostOrder();
			} 
			
			if ( right != null ) {
				right.printPostOrder();
			}
			
			System.out.print(data+" ");
		}
		
//		To Check value is present or not
		private boolean Contains(int value) {
			
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

	
// 	Driver function
	public static void main(String[] args) {
		
		boolean q = true;
		
		Scanner s = new Scanner(System.in);
		
		Node node = new Node();
		
		System.out.println("1 - Inserting\n2 - In-Order Traversal\n3 - Pre-Order Traversal\n4 - Post-Order Traversal\n5 - Value Checking\n\n");
		System.out.println("* * Waiting * *");
		
		while (q) {
			
			int cases = s.nextInt();

			switch (cases) {
				
// 				Inserts value
				case 1:
				
					System.out.println("enter value count: ");
					int total = s.nextInt();
					System.out.println("enter count: ");
					node = new Node(s.nextInt());
					
					for (int i=0;i<total-1;i++) {
						node.insertData(s.nextInt());
					}
					System.out.println("values inserted!!..");
					break;
				
// 				prints In-Order Traversal
				case 2: 
					
					System.out.println("In-Order Traversal - [Left,Root,Right]");
					node.printInOrder();
					System.out.println("\n");
					break;
					
// 				prints Pre-Order Traversal
				case 3: 
					
					System.out.println("Pre-Order Traversal - [Root,Left,Right]");
					node.printPreOrder();
					System.out.println("\n");
					break;
					
// 				prints Post-Order Traversal
				case 4: 
					
					System.out.println("Post-Order Traversal - [Left,Right,Root]");
					node.printPostOrder();
					System.out.println("\n");
					break;
					
// 				checks value is present or not
				case 5: 
					
					System.out.println("value checking!..");
					if (node.Contains(s.nextInt())) {
						System.out.println("value found!!!");
					} else {
						System.out.println("value not found!!!");
					}
					break;

// 				stops the driver loop
				default :

					q = false;
					System.out.println("Wind Up!!!..");
				}
		}
		s.close();
	}

}
