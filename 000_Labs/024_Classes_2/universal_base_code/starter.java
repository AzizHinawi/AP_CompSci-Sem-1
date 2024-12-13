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
		myCharacter test = new myCharacter();
		System.out.println(test.role);
		System.out.println("Your strength stat is: "+test.strength+"\nYour dexterity stat is: "+test.dex+"\nYour intelligence stat is: "+test.intel+"\nYour charisma stat is: "+test.charisma);
	}
}
