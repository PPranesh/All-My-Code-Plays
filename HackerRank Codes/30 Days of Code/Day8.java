import static java.lang.reflect.Array.set;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Dictionaries_and_Maps {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String a,b;
        Map<String,String> PhoneBook = new HashMap<String,String>();
        String o =scan.nextLine();
        int n=Integer.parseInt(o);
        for(int i=0;i<n;i++){
           a=scan.next();
           b=scan.next();
           PhoneBook.put(a,b);
        }
        Set<String> name =PhoneBook.keySet();
        Collection<String> Phone=PhoneBook.values();
            while(scan.hasNext()){
                String s = scan.next();
                if(PhoneBook.containsKey(s)){
                    System.out.println(s+"="+PhoneBook.get(s));
                }
                else{
                    System.out.println("Not found");
                }
            }
        scan.close();
    }
}




