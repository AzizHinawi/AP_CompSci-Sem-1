/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;


class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		Scanner sc = new Scanner (System.in);
		System.out.println("What's your name?");
		String name = sc.nextLine();
		System.out.println("How old are you?");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("What month were you born? (1-12)");
		int month = sc.nextInt();
		sc.nextLine();
		System.out.println("What day were you born? (1-31)");
		int day = sc.nextInt();
		sc.nextLine();
		System.out.println("What year were you born?");
		int born = sc.nextInt();
		sc.nextLine();
		System.out.println("If I have a dollar and two quarters, how much money do I have? (0.0-#)");
		double money = sc.nextDouble();
		sc.nextLine();
		System.out.println("You're " + name + " and you are " + age + " years old.");
		System.out.println("You were born on " + month + "/" + day + "/" + born);
		System.out.print("Wow, that's it? You only have $" + money + " dollars? HAHAHA");
		
		
		
		
		
		
		
		
		
	}
}
