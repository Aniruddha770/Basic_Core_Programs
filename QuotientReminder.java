/**
 * 
 * @author Aniruddha
 *
 */
import java.util.Scanner;
public class QuotientReminder {
	public static void main(String[] args) {
		int dividend,divisor,Quo,Rem;
		Scanner sc = new Scanner (System.in);
		
		//Enter Dividend value
		System.out.println("Enter Dividend");
		dividend= sc.nextInt();
		
		//Enter Divisor value
		System.out.println("Enter Divisor");
		divisor= sc.nextInt();
		
		//For Quotient
		Quo= dividend/divisor;
		
		//For Reminder
		Rem= dividend%divisor;
		
		System.out.println("Quotient is " + Quo);
		System.out.println("Reminder is " + Rem);
		
				
		
	}

}
