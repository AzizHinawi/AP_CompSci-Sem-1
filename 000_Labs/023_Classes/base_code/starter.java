/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class Character{
	String role = new String("Warrior");
}
class Stats{
	int strength =  5;
	int dex =  5;
	int intel =  5;
	int charisma =  5;
	String amount = new String("Your strength stat is: "+test.strength+"\nYour dexterity stat is: "+test.dex+"\nYour intelligence stat is: "+test.intel+"\nYour charisma stat is: "+test.charisma);
}

class starter {

	public static void main(String args[]) {
	Character myCharacter = new Character();
	System.out.println(myCharacter.role);
	Stats myStats = new Stats();
	System.out.println(myStats.amount);
	
		
	}
}
