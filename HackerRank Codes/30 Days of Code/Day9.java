import java.util.Scanner;
public class Recursion {
    public static void main(String[] args){
        int result;
        Scanner scan = new Scanner(System.in);
        //System.out.println("Enter the factorial value: ");
        int n = scan.nextInt();
        result = factorial(n);
        System.out.println(result);
        scan.close();
    }

    
    public static int factorial(int n){
        if(n == 1){
            return 1;
        }
        else if(n > 1){
             return  n*factorial(n-1);
        }else{
            return 0;
        }
    } 
}



