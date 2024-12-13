/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
		
	public int str;
	public int dex;
	public int intel;
	public int charis;
	public String role;
	
	
	public myCharacter(String inputRole){
		role = inputRole;
		String lowerCaseRole = role.toLowerCase();
		boolean w = lowerCaseRole.equals("wizard");
		boolean wa = lowerCaseRole.equals("warrior");
		boolean r = lowerCaseRole.equals("rogue");
	
		if(w)
		{
			System.out.println("Knowledge is the greatest power. Welcome, Wizard.");
		}
		else if(wa)
		{
			System.out.println("For honor and for glory! Welcome in, Warrior.");
		}
		else if(r)
		{
			System.out.println("Why fight when you can sneak? Welcome in, Rogue.");
		}
	}

	public myCharacter() {
		
	}

}

