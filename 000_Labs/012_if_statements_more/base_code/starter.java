/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Please put a number: ");
		int number1 = sc.nextInt();
		sc.nextLine();
		System.out.println("And another one just for good measure: ");
		int number2 = sc.nextInt();
		sc.nextLine();
		boolean different = number1<number2;
		boolean diff = number1>number2;
		boolean equal = number1==number2;
		
		
		if(different)
		{
			System.out.println("The numbers are different!");
		}
		else if(equal)
		{
			System.out.println("The numbers are equal");
		}
		else if(diff)
		{
			System.out.println("The numbers are different!");
		}
		
		
		
		
		
		
	}
}
