/**
 * @author Aniruddha
 * Powers Of 2
 */


import java.util.Scanner;
public class testing {

		public static void main(String[] args) {
			int n;		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter value of n");
			n=sc.nextInt();
			int result=1;
			System.out.println("The" + n +" powers of 2 are");
			for (int i=0; i<n; i++ ) {
				result=result*2;
				System.out.println( result);
			}
			
		}
}
	


