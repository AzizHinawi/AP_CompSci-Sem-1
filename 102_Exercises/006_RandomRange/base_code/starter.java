/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Please put in a number: ");
		int numb1 = sc.nextInt();
		System.out.print("Please put in anther number(must be bigger than your first): ");
		int numb2 = sc.nextInt();
		int numb3 = (int)(Math.random()*(numb2-numb1))+numb1;
		int numb4 = (int)(Math.random()*(numb2-numb1))+numb1;
		int numb5 = (int)(Math.random()*(numb2-numb1))+numb1;
		int numb6 = (int)(Math.random()*(numb2-numb1))+numb1;
		int numb7 = (int)(Math.random()*(numb2-numb1))+numb1;
		System.out.println("Your 5 random numbers between the range of "+numb1+" to "+numb2+" is: \n"+numb3+", "+numb4+", "+numb5+", "+numb6+", "+numb7);
		
		
		
		
		
		
		
		
		
		
	}
}
