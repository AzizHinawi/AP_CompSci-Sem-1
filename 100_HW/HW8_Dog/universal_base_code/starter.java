/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Dog firstDog = new Dog("Maxwell", 5);
		Dog secondDog = new Dog("Hubaba", "Big bad dog");
		
		if(firstDog.isSleeping()){
		System.out.println(firstDog.getName() + " is asleep.");
    	} 
    	else {
        firstDog.bark();
		}	
		if(secondDog.isSleeping()){
			if(!firstDog.isSleeping()){
				secondDog.bark();
			}
		}
		else{
			if(!firstDog.isSleeping()){
				secondDog.bark();
			}
		}
		
		



	}
}
