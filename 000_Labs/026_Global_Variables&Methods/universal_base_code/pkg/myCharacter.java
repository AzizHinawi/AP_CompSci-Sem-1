/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {

	public int strength;
	public int dexterity;
	public int intelligence;
	public int charisma;
	public String role;
	
	public myCharacter(String inputRole) {
		role = inputRole;
		String lowerCaseRole = role.toLowerCase();
		boolean wizard = lowerCaseRole.equals("wizard");
		boolean warrior = lowerCaseRole.equals("warrior");
		boolean rogue = lowerCaseRole.equals("rogue");
	
		if(wizard)
		{
			System.out.println("Knowledge is the greatest power. Welcome, Wizard.");
		}
		else if(warrior)
		{
			System.out.println("For honor and for glory! Welcome in, Warrior.");
		}
		else if(rogue)
		{
			System.out.println("Why fight when you can sneak? Welcome in, Rogue.");
		}
	}

}

