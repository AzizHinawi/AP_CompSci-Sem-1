/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Your role is No Role");
		System.out.println("Your stength stat is: 0 \nYour dexterity stat is: 0 \nYour intelligence stat is: 0 \nYour charisma stat is: 0");
		System.out.println("-------------------------------------");
	
	
		System.out.print("What class would you like to be? ");
		String role = sc.nextLine();
		
		myCharacter test = new myCharacter(role);
		System.out.println( "Your stength stat is: "+test.str+" \nYour dexterity stat is: "+test.dex+" \nYour intelligence stat is: "+test.intel+" \nYour charisma stat is: "+test.charis);
		
	

		
	}
}
