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
		System.out.print("Please put your first number: \n");
		int number1 = sc.nextInt();
		sc.nextLine();
		System.out.print("Please put your second number: \n");
		int number2 = sc.nextInt();
		sc.nextLine();
		System.out.print("Please put your third number: \n");
		int number3 = sc.nextInt();
		sc.nextLine();
		
		int big = number1;
		int small = number1;
		
		if(number2 >  big)
		{
			big = number2;
		}
		if(number3 > big)
		{
			 big = number3;
		}
		if(number2 < small)
		{
			small = number2;
		}
		if(number3 < small)
		{
			small = number3;
		}
		
		System.out.println("Your largest number out of the three is: "+big+"!");
		System.out.println("Your smallest number out of the three is: "+small+"!");
		
	}
}
