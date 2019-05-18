/**
 * 
 */
package Trees;

/**
 * @author Pranesh
 *
 * May 18, 2019 - MyTree.java
 */
import Trees.Node;
import java.util.Scanner;

public class MyTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		boolean q = true;
		
		Scanner s = new Scanner(System.in);
		
		Node node = new Node();
		
		System.out.println("1 - Inserting\n2 - In-Order Traversal\n3 - Pre-Order Traversal\n4 - Post-Order Traversal\n5 - Value Checking\n\n");
		System.out.println("!!! Waiting !!!");
		
		while (q) {
			
//			System.out.println("enter 1-2");
			int cases = s.nextInt();
			
			switch (cases) {
				
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
				
				case 2: 
					
					System.out.println("In-Order Traversal - [Left,Root,Right]");
					node.printInOrder();
					System.out.println("\n");
					break;
					
				case 3: 
					
					System.out.println("Pre-Order Traversal - [Root,Left,Right]");
					node.printPreOrder();
					System.out.println("\n");
					break;
					
				case 4: 
					
					System.out.println("Post-Order Traversal - [Left,Right,Root]");
					node.printPostOrder();
					System.out.println("\n");
					break;
					
				case 5: 
					
					System.out.println("value checking!..");
					if (node.Contains(s.nextInt())) {
						System.out.println("value found!!!");
					} else {
						System.out.println("value not found!!!");
					}
					break;

				default :

					q = false;
					System.out.println("Wind Up!!!..");

				}
			
		}
		
		s.close();
	}

}



