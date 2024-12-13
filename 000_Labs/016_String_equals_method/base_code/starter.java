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
	
	System.out.println("Welcome your majesty, please pick to be either a Wizard, Warrior, or Rogue.");
	String pick = sc.nextLine();
	
	boolean w = pick.equals("Wizard");
	boolean wa = pick.equals("Warrior");
	boolean r = pick.equals("Rogue");
	
	if(w)
	{
		System.out.println("Welcome, Wizard, would you like to begin?");
	}
	else if(wa)
	{
		System.out.println("Welcome, Warrior, would you like to begin?");
	}
	else if(r)
	{
		System.out.println("Welcome, Rogue, would you like to begin?");
	}
	else
	{
		System.out.println("That's not a role, please pick an actual one next time.");
	}
	
	
	
	}
}
