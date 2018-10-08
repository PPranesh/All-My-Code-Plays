package MyStack;

/**
 *
 * @author Pranesh
 */

// packages imported
import java.util.Scanner;

// StackPlayer Main Class
public class StackPlayer {
    public static void main(String[] args){
        
        // global declarations
        int arraySize,SwitchOption,n;
        boolean run = true;
        
        Stack stack = new Stack();
        
        // Scanner Class
        Scanner s = new Scanner(System.in);
        
        // getting and initializing array size
        System.out.println("Enter the Array Size");
        arraySize = s.nextInt();
        stack.getArraySize(arraySize);
        
        System.out.println("Enter the values based on to work");
        stack.menu();
                
        while(run){
            SwitchOption = s.nextInt();
            switch(SwitchOption){
                
                case 1:
                    System.out.println("Enter no.of Test Cases:");
                    n = s.nextInt();
                    if(n == 0){
                        break;
                    }else{
                        System.out.println("to push:");
                        for(int i=0;i<n;i++){
                            int data = s.nextInt();
                            stack.push(data);
                        }
                    }
                    break;
                    
                case 2:
                    stack.pop();
                    break;
                
                case 3:
                    stack.peek();
                    break;
                    
                case 4:
                    System.out.println("* * * * * Stack Contains * * * * *");
                    stack.show();
                    System.out.println("\n* * * * * Stack ends here * * * * *");
                    break;
                    
                case 5:
                    System.out.println("Stack is Empty: "+stack.isEmpty());
                    break;
                    
                case 6:
                    System.out.println("Stack can still hold "+stack.balanceStackSize()+" values.");
                    break;
                    
                case 7:
                    run = false;
                    break;
                    
                default:
                    stack.menu();
            }
        }
    }
}

// Stack Class
class Stack{
    
    // global declarations
    int Top = 0,StackArray[],arrayLen;
    
    // getting and initializing array size
    public void getArraySize(int n){
        StackArray = new int[n];
        arrayLen = n;
    }
    
    // inserting(pushing) data's into stack
    public void push(int data){
        
        if(Top >= StackArray.length){
            System.out.println("Stack size overflowed!!");
            increaseArray();
        }
        else if(Top == StackArray.length){
            System.out.println("Stack reached it's Limit");
            increaseArray();
            
        }else{
            StackArray[Top] = data;
            System.out.println("Data Pushed!");
            Top++;
        }
    }
    
    // deleting(poping) data's from stack
    public void pop(){
        int data;
        if(Top == 0){
            System.out.println("Stack is Empty");
        }else{
            Top--;
            data = StackArray[Top];
            StackArray[Top] = 0;
            System.out.println("TOS Poped!");
            arrayShrinked();
        }
    }
    
    // peeking(displaying) only the TOS from stack
    public void peek(){
        int data=0;
        
        if(Top == 0){
            System.out.println("TOS is already Empty");
        }else{
            data = StackArray[Top-1];
            System.out.println("Top of the Stack is : "+data);
        }
    }
    
    // displaying all the data's from stack
    public void show(){    
        for(int i=0;i<StackArray.length;i++){
            System.out.println(i+" : "+StackArray[i]+" ");
        }
    }
    
    // check's whether the stack is empty or not
    public boolean isEmpty(){
        boolean empty;
        
        if(Top == 0){
            return empty = true;
        }else{
            return empty = false; 
        }
    }
    
    // show's how many can be inserted into stack
    public int balanceStackSize(){
        int balance = StackArray.length;
        balance -= (Top);
        return balance;
    }
    
    // display's the menu
    public void menu(){
            System.out.println("\t 1 - Push \t 2 - Pop \t 3 - Peek \t 4 - show \t 5 - Empty Stack? \t 6 - Remain Stack Size \t 7 - Exit");
    }
    
    // increases the array size if StackArray array reache's it's limit
    private void increaseArray() {
        int Len = StackArray.length;
        int newStack[] = new int[arrayLen*2];
        System.arraycopy(StackArray, 0, newStack, 0, Len);
        StackArray = newStack;
        arrayLen *= 2;
    }
    
    // shrink's the array size is size is below 3/4 of it's length
    private void arrayShrinked() {
        int Len = StackArray.length;
        if(Len <= (arrayLen/2)/2){
            arrayLen = arrayLen/2;
        }
        int newStack[] = new int[arrayLen];
        System.arraycopy(StackArray, 0, newStack, 0, Len);
        StackArray = newStack;
    }
    
    
//  Stack Class ends here 
}
