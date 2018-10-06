import java.util.*;
public class JavaStringsIntroduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int a,b,length;
        String lengt;
        
        String A=sc.next();           // gets the first string
        String B=sc.next();           // gets the second string
        a = A.length();               // calculates the first string length
        b = B.length();               // calculates the second string length
        lengt = Strlen(A,B);          // calls the functions with two input strings as parameters
        length = a+b;                 // calculates the total length

        // converts the first strings first letter to upper case and joins the remaining string
        String one = A.substring(0, 1).toUpperCase()+A.substring(1); 
        
        // converts the second strings first letter to upper case and joins the remaining string
        String two = B.substring(0, 1).toUpperCase()+B.substring(1);          
        System.out.println(length);       // prints the total length
        System.out.println(lengt);        // prints the biggest value result
        System.out.println(one+" "+two);        
    }
    
    
    static String Strlen(String a,String b){
        String leng;
        
        // converts the first strings first letter to lower case and joins the remaining string
        String z = a.substring(0, 1).toLowerCase()+a.substring(1);        
        
        // converts the second strings first letter to lower case and joins the remaining string
        String q = b.substring(0, 1).toLowerCase()+b.substring(1);        
        if(z.charAt(0) > q.charAt(0)){          // compares the char's ascii values 
            leng = "Yes";                       // returns true if z is bigger
        }
        else{
            leng = "No";                        // returns false if z is smaller
        }
        return leng;        // returns the string
        }
}
