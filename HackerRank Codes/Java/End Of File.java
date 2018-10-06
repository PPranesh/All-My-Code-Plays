import java.util.Scanner;

public class EndOfFile {
 
    // main function
    public static void main(String[] args){
        //String a;
        int x=1;
        
        // scanner class
        Scanner s = new Scanner(System.in);
        
        // while runs until input gets stopped
        while (s.hasNextLine()) {
            System.out.println(x++ + " " +s.nextLine());
        }
    }
}



