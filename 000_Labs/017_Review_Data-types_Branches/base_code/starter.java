/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello Sire, what be thou name?"); 
		String name = sc.nextLine();
		System.out.println("Hello "+name+", what might your title be? Ex: Slayer of dragons");
		String title = sc.nextLine();
		System.out.println("What would you like to be, "+title+"? A Wizard, Rogue, or Warrior?");
		String pick = sc.nextLine();
		
		String lowerCasePick = pick.toLowerCase();
	
		boolean w = lowerCasePick.equals("wizard");
		boolean wa = lowerCasePick.equals("warrior");
		boolean r = lowerCasePick.equals("rogue");
	
		if(w)
		{
			System.out.println("Knowledge is the greatest power. "+title+", I hope you're ready..");
		}
		else if(wa)
		{
			System.out.println("For honor and for glory! "+title+", I hope you're ready..");
		}
		else if(r)
		{
			System.out.println("Why fight when you can sneak? "+title+", I hope you're ready..");
		}
		else
		{
			System.out.println("That's not a role, please pick an actual role (use a capital first letter).");
			pick = sc.nextLine();
		}
	
		System.out.println("-------------------------------------------------");
		System.out.println("You have the total of 20 skill points that you'll be able to spend on the following: \n Strength, Dexterity, Intelligence, and Charisma.\n Spend them wisely..");
	
		System.out.println(" ");
	
		System.out.print("Strength (1-10): ");
		int strength = sc.nextInt();
		if(strength>10)
		{
			System.out.println("Please input a smaller value, within the range.");
			strength = sc.nextInt();
		}
			int amount = 20 - strength;
		
			System.out.println(" ");
		
			System.out.println("You have "+amount+" skill points left.");
			System.out.println(" ");
			System.out.print("Dexterity (1-10): ");
		int dex = sc.nextInt();
		if(dex>10){
			System.out.println("Please input a smaller value, within the range.");
			dex = sc.nextInt();
		}
		int amount2 = amount - dex;
			System.out.println(" ");
			System.out.println("You have " +amount2+" skill points left.");
			
			System.out.println(" ");

			System.out.print("Intelligence(1-"+amount2+"): ");
		int intel = sc.nextInt();
		if(intel>amount2){
			System.out.println("Please input a smaller value, within the range.");
			intel = sc.nextInt();
		}
		int amount3 = amount2 - intel;
	
			System.out.println(" ");
	
			System.out.println("You have "+amount3+" skill points left(0-"+amount3+")");
			System.out.println(" ");
			System.out.print("Charisma: ");
		int charis = sc.nextInt();
		if(charis != amount3){
			System.out.println("You don't have that many skill points dude, chill out. Try again..");
			charis = sc.nextInt();
		}
		int amount4 = amount3 - charis;

System.out.println("-------------------------------------------------");

System.out.println("You should have spent all of your points wisely because currently: ");
System.out.println("Your name is "+name+", you'll go by "+title+", and you have chosen the "+pick+" class.");
System.out.println("Your stats are the following: \n Strength: "+strength+"\n Dexterity: "+dex+"\n Intelligence: "+intel+"\n Charisma: "+charis+"\n");


		
		
		
	}
}




