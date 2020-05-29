import java.util.Scanner;

public class FindingUniqueNumbers {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	
		int input = s.nextInt();
		int res = solution(input);
		
		System.out.println(res);
	}
	
	static int solution (int n) {

		String a = ""+n;	
		
		int rem=0,arr_pos=0,len=0,result=0;
		
		len = a.length();
		
		int old_arr[] = new int[]{9,99,999,9999,99999,999999,9999999};
		int new_arr[] = new int[len];
		
		if (n <= 0) {
		
			return 0;
		} else if (n < 10){
			
			return n;
		
		} else {
			
			while (len >= 2) {
		
				rem = n - old_arr[len-2];
				new_arr[arr_pos++] = (rem * len);
				n = old_arr[len-2];
				len = len-1;
				
				System.out.println("rem="+rem+", n="+n+", len="+len);
				if (len == 1) {
					new_arr[arr_pos++] = n;
				}		
			}
		
			for (int i=0;i<a.length();i++) {
				result += new_arr[i];
				System.out.print(new_arr[i]+" ");
			}
			
			System.out.println();
			return result;
		}
	
	}
	
}
