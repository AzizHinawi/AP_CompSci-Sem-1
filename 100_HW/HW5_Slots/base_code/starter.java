/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	int vd = 100;
	
	System.out.println("Slot machine rules: \n1. Each 'gambler' starts with 100 buckaroons.\n2. Input a wager less than your total amount of money, please don't make it hard.\n3. The slot machine is going to roll 3 numbers from 1 to 10.\n a. If two numbers match, you double your wager.\n b. If three numbers match, you get a jackpot and triple your wager.\n c. If no numbers match, you lose your wager.\n --------------------------------------------------");
	
	System.out.print("Would you like to start the gamble? (Yes/yes/Y/y) : ");
	String answer = sc.nextLine();
	
	if(answer.equals("Yes") || answer.equals("yes") || answer.equals("Y") || answer.equals("y")){
		System.out.println("Great! Let's get started...");
	}
	else if(answer.equals("No") || answer.equals("no") || answer.equals("N") || answer.equals("n")){
		System.out.println("Okay please come again soon! Your balance is $"+vd);
		return;
	}
	else{
	System.out.print("That's not an answer, please try again. ");
	answer = sc.nextLine();
	}
	
	
	while(vd > 0){
		System.out.print("You have $"+vd+". How much would you like to wager? ");
		int wager = sc.nextInt();
		sc.nextLine();
		
		if(wager <=0 || wager > vd){
			System.out.println("Hah, you think you're slick by going over your amount?? Oh! Also no Negatives or zeros!");
			continue;
		}
		 int roll1 = (int)(Math.random()*9) + 1;
         int roll2 = (int)(Math.random()*9) + 1;
         int roll3 = (int)(Math.random()*9) + 1;
         System.out.println("Rolling... Your rolls are:\n-------------\n  "+roll1+" | "+roll2+" | "+roll3+"\n-------------");
		
		if(roll1 == roll2 && roll2 == roll3){
			vd = vd + (wager * 3);
			System.out.println("Jackpot!! You have just tripled your wager. Now you are at"+vd);
		}
		else if(roll1 == roll2 || roll1 == roll3 || roll2 == roll3){
		vd = vd + (wager * 2);
		System.out.println("You have successfully doubled your wager! Now you are at $"+vd);
		}
		else{
			vd = vd - wager;
			System.out.println("You unfortunately have lost your money this time and now have $"+vd+", beter luck next time!");
			
		}
		
		if(vd <= 0){
		System.out.println("Unfortunately you have lost all your money, hope to see you soon!");
		return;
		}
		
		System.out.print("Would you like to start the gamble? (Yes/yes/Y/y) : ");
		answer = sc.nextLine();
		
		if(answer.equals("Yes") || answer.equals("yes") || answer.equals("Y") || answer.equals("y")){
			System.out.println("Great! Let's get started...");
		}
		else if(answer.equals("No") || answer.equals("no") || answer.equals("N") || answer.equals("n")){
			System.out.println("Okay please come again soon! Your balance is $"+vd);
			return;
		}
		else{
			System.out.print("That's not an answer, please try again. ");
			answer = sc.nextLine();
		}
		
	}

	
		if(vd <= 0){
		System.out.println("Unfortunately you have lost all your money, hope to see you soon!");
	}
	
	}
}
