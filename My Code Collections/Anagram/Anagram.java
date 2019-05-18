import java.util.*;

public class Anagram {
    public static void main(String[] args){
    String a,b;      //declaring two strings
    int check=0,rest=0;       //check - anagram true & rest - anagram false                                                 
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the first string: ");
    a = s.nextLine();         //getting the first string
    System.out.println("Enter the second string: ");
    b = s.nextLine();         // getting the second string
    char[] name1 = a.toCharArray();         //converting to char array
    char[] name2 = b.toCharArray();         //converting to char array

    for(int i=0;i<name1.length;i++){
        for(int j=0;j<name2.length;j++){
            if(name1[i] == name2[j]){         // if left == right condition gets inn
                check = 1;                    // renames check to 1
                name2[j] = ' ';               // removes the char in 2'nd string
                break;                        // comes out of j - loop strats with i as 0 & j as 1
            }
        }
            if(check == 1){            // check is 1 renames as zero
                check=0;
                continue;               // continues from first loop as i as 1 & j as 0
            }
            else{
                rest = 1;               // if condition fails renames rest as 1
                break;                  // breaks the loop and returns as not an anagram 
            }  
    }

        if(rest == 0){
            System.out.println("It's an Anagram!!!");         // returns true 
        }
        else{
            System.out.println("Not an Anagram.");            // returns false
        }
    }
}



