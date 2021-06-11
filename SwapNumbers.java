/**
 * 
 * @author Aniruddha
 *
 */
import java.util.Scanner;
public class SwapNumbers {
	public static void main(String[] args) {
		//x and y are two numbers which we have to swap
		int x,y,t;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		x= sc.nextInt();
		System.out.println("Enter Second Number");
		y= sc.nextInt();
		System.out.println("The numbers before swapping are" +x +" " +y);
		 //Swapping
		t=x;
		x=y;
		y=t;
	 
		System.out.println("The numbers after swapping are" +x +" " +y);
		
		
		
		
	}

}
