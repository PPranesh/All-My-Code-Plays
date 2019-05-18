/**
 * @author Pranesh
 **/
package MyLinkedList;
import java.util.Scanner;

// Main Class
public class MainPlayer {
    
    public static void main(String[] args){
        
        //global variables
        int n,a,data;         
        boolean q=true;
        
        // scanner class
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the values based upon the work");
        System.out.println("Enter 1 to add: ");
        System.out.println("Enter 2 to add @position: ");
        System.out.println("Enter 3 to add @first: ");
        System.out.println("Enter 4 to remove: ");
        System.out.println("Enter 5 to view the list: ");
        System.out.println("Enter 6 to count the data's: ");
        
        LinkedList list = new LinkedList();
        System.out.println("\nList starts here!!");
        
        while(q){   //using while loop we can run until we stop the loop manually
            a = s.nextInt();    //getting the choice from the user
            switch(a){  
            case 1: 
                
                // adds the input element in the last
                System.out.println("Enter no.of testcases: ");
                n = s.nextInt();
                System.out.println("to add: ");
                for(int i=0;i<n;i++){
                    data = s.nextInt();
                    list.insert(data);
                }
                System.out.println("Value added!!");
                break;
            
            case 2:
                
                // manually insert's at desired position
                System.out.println("Enter no.of testcases: ");
                n = s.nextInt();
                for(int j=0;j<n;j++){
                    System.out.println("Enter the index: ");
                    int position = s.nextInt();
                    data = s.nextInt();
                    list.insertAt(position, data);
                }
                System.out.println("Value's added in the given position");
                break;
            
            case 3:
            
                // manually insert's at first
                System.out.println("Enter no.of testcases: ");
                n = s.nextInt();
                System.out.println("to add: ");
                for(int j=0;j<n;j++){
                    data = s.nextInt();
                    list.insertAtStart(data);
                }
                System.out.println("Value added in the first");
                break;
            
            case 4:
            
                // delete's the data at desired position
                System.out.println("Enter no.of testcases: ");
                n = s.nextInt();
                for(int j=0;j<n;j++){
                    System.out.println("Enter the index value to remove: ");
                    int position = s.nextInt();
                    list.deleteAt(position);
                }
                System.out.println("value removed");
                break;
            
            case 5:
            
                // displays the list 
                System.out.println("\n* * * Linked List Contains * * *\n");
                list.show();
                System.out.println("\n* * * Ends here!! * * *");
                break;               
            
            case 6:
                
                // count's total number of data available
                list.countData();
                break;
                
            default:
                
                // stops the loop to terminate
                q = false;
            
            // switch case ends here
            }
        
        // while loop ends here
        }
    
    // main function ends here
    }

// playerMain Class ends here
}



// Node Class
class Node {
    int data;
    Node next;
}



// Linked List Class
class LinkedList {
    Node head;
    int count = 0;
    // Automatically insert's at Last
    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        
        if( head == null){
            head = node;
        }else{
            Node n = head;
            
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
        }       
    }
    
    // manually insert's at first
    public void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }
    
    // displays the list
    public void show(){
        Node node = head;
        
        if (head == null){
            System.out.println("List has no Values!!");
        }else{
            while( node.next != null){
            System.out.println(node.data);
            node = node.next;
            }
        System.out.println(node.data);
        }
    }
    
    // manually insert's at desired position
    public void insertAt(int position,int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        
        if(position == 0){
            insertAtStart(data);
        }else{
            Node n = head;
            for(int i=0;i< position-1;i++){
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }
    
    // delete's the data at desired position
    public void deleteAt(int position){
        
        if(position == 0){
            head = head.next;
        }else{
            Node n = head;
            Node temp;
            
            for(int i=0;i< position-1;i++){
                n = n.next;
            }
            temp = n.next;
            n.next = temp.next;
            temp = null;
        }
    }
    
    // counts the number of data's available
    public void countData(){
        tempShow();
        count++;
        System.out.println(count+" - Data's are available!");
        count = 0;
    }
    
    // simply for counting the data's in the list
    public void tempShow(){
        Node node = head;
        
        if (head == null){
         
        }else{
            while( node.next != null){
            count += 1;
            node = node.next;
            }
        }
    }
}
