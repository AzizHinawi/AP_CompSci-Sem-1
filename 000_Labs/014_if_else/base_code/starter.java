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
	int y = (int) (Math.random()*1000);
	
	System.out.print("Pick a number 0-1000: ");
	int number1 = sc.nextInt();
	boolean yes = number1==y;
	
	if(yes)
	{
		System.out.println("You got it! The number was "+y+"!");
	}
	else
	{
		System.out.println("You did not get the number, it was "+y+"!");
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	 
	}
}
