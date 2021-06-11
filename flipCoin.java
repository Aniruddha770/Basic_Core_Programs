/**
 * @author Aniruddha
 * @since 11 Jun 2021
 * FlipCoin Problem
 */



import java.util.Scanner;
public class flipCoin {
	public static void main(String[] args) {
		System.out.println("Enter the no of times you want to flip coin");
		Scanner sc= new Scanner(System.in);
		int count = sc.nextInt();
		double coinresult;
		double headcount = 0;
		double tailcount = 0;
		for(int i=0;i<=count;i++) {
			coinresult = Math.random();
			System.out.println(coinresult);
			if(coinresult < 0.5) {
				tailcount++;
			} 
			else {
				 headcount++;
			}
			System.out.println(headcount);
			System.out.println(tailcount);
			double HeadPercentage = (headcount/(double) count)*100;
			double TailPercentage = (tailcount/(double) count)*100;
			System.out.println("Head Percentage" + HeadPercentage);
			System.out.println("Tail Percentage" + TailPercentage);
			
			
		}
		
				
	}

}
