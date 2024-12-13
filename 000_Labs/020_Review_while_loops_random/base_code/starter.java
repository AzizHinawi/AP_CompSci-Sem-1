/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int x = (int)(Math.random()*1000);
	System.out.print("Try and guess a number within 1-1000: ");
	
	int choice = sc.nextInt();
	
	int y = x;
	
	while(true){
		if(choice == x){
			System.out.print("You guessed it! The number was in fact "+x+".");
			return;
		}
		else if(choice <= x){
			System.out.print(choice+" is a little low!");
			System.out.println(" ");
			System.out.print("Guess again: ");
			choice = sc.nextInt();
		}
		else if(choice >= x){
			System.out.print(choice+" is a little too high!");
			System.out.println(" ");
			System.out.print("Guess again: ");
			choice = sc.nextInt();
		}
		if(choice > 1000){
			System.out.print("Try guessing a number within 1-1000");
		}
	}
	
	
	
		}
	}
		

	

		
	
