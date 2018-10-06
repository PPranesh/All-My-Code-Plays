
import java.util.LinkedList;
import java.util.Scanner;

 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pranesh
 */
public class PackageLinkedList {
    public static void main(String[] args){
        int n,a,value;          //global variables
        boolean q=true;
        
        Scanner s = new Scanner(System.in);     // used to get input from the user
        
        LinkedList list = new LinkedList();       // predefined package used for singly linked list
        
        System.out.println("Enter the values to add: ");
        System.out.println("Enter 1 to add: ");
        System.out.println("Enter 2 to add @position: ");
        System.out.println("Enter 3 to add @first: ");
        System.out.println("Enter 4 to remove: ");
        System.out.println("Enter 5 to view the list: ");
  
        
         
        while(q){   //using while loop we can run until we stop the loop manually
            a = s.nextInt();    //getting the choice from the user
            switch(a){  
            case 1: 
                
                // adds the input element in the last
                System.out.println("Enter no.of testcases: ");
                n = s.nextInt();
                System.out.println("to add: ");
                for(int i=0;i<n;i++){
                value = s.nextInt();
                list.add(value);
                }
                System.out.println("Value added!!");
                System.out.println("List contains: "+list);
                break;
            
            case 2:
                
                // inserts the values wherever the user says
                System.out.println("Enter no.of testcases: ");
                n = s.nextInt();
                for(int j=0;j<n;j++){
                    System.out.println("Enter the index: ");
                    int z = s.nextInt();
                    value = s.nextInt();
                    list.add(z, value);
                }
                System.out.println("Value added in the given position");
                break;
            
            case 3:
            
                // getting values will be added at the first
                System.out.println("Enter no.of testcases: ");
                n = s.nextInt();
                value = s.nextInt();
                list.addFirst(value);
                System.out.println("Value added in the first");
                break;
            
            case 4:
            
                // removes the value in which the user says
                System.out.println("Enter no.of testcases: ");
                n = s.nextInt();
                System.out.println("Enter the index value to remove: ");
                int zz = s.nextInt();
                list.remove(zz);
                System.out.println("value removed");
                break;
            
            case 5:
            
                // displays the Linked list 
                System.out.println("show: "+list);
                break;               
            
            case 6:
                
                // stops the loop to terminate
                q = false;
            }
        }
    }
}
