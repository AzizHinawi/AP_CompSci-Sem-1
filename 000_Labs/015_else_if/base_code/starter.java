/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		int x = (int) (Math.random()*1000);
		System.out.print("Please pick a number 1-1000: ");
		int number1 = sc.nextInt();
		
		boolean yes = number1==x;
		boolean higher = number1>x;
		
		
		if(yes)
		{
			System.out.println("You got the number! It was "+x+"!");
		}
		else if(higher)
		{
			System.out.println("You were higher than the number, the number was "+x+" if you care.");
		}
		else
		{
			System.out.println("Your number was lower than the actual number, the number is "+x+" if you really care.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
