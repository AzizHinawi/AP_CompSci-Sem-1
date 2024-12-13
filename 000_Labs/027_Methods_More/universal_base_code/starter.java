/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("Your role is No Role");
		System.out.println("Your stength stat is: 0 \nYour dexterity stat is: 0 \nYour intelligence stat is: 0 \nYour charisma stat is: 0");
		System.out.println("-------------------------------------");
		
		System.out.println("What role would you like to be? (Warrior, Wizard, or Rogue): ");
		String role = sc.nextLine();
		
		myCharacter test = new myCharacter(role);
		
		System.out.println("Your role is "+test.role);
		System.out.println("How much skill points would you like to go in your strength in your "+test.role+" class?");
		int strength = sc.nextInt();
		System.out.println("You have "+test.strength+" strength points.");
		System.out.println("How much skill points would you like to go in your dexterity in your "+test.role+" class?");
		int dexterity = sc.nextInt();
		System.out.println("You have "+test.dexterity+" dexterity points.");
		
	}
}
