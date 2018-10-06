import java.util.*;

class JavaLoops_II{
    public static void main(String[] args){
        int sum;
        Scanner in = new Scanner(System.in);
        int q=in.nextInt();
        for(int i=0;i<q;i++){
            sum=0;
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0;j<n;j++){
                sum= a;
                for(int k=0;k<=j;k++)
                sum = (int) (sum+(Math.pow(2,k))*b);
                System.out.print(sum+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
