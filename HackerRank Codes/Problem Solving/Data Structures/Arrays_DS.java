import java.util.Scanner;
public class Arrays_DS {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int A[] = new int[n];
        for(int i=0;i<n;i++){
            A[i] = s.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            System.out.print(A[i]+" ");
        }       
    }
}
