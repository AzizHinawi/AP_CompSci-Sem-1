/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Wizard [] wizards = new Wizard[100];
	Warrior [] warriors = new Warrior[100];
	
	for(int i = 0; i < wizards.length; i++){
		wizards[i] = new Wizard();
	}
	for(int i = 0; i < warriors.length; i++){
		warriors[i] = new Warrior();
	}
		
	int currentWizard = 0;
	int currentWarrior = 0;
	
	int totalWizards = wizards.length;
	int totalWarriors = warriors.length;
	
	while(currentWarrior < warriors.length && currentWizard < wizards.length){
		if(!wizards[currentWizard].isDead()){
			wizards[currentWizard].attack(warriors[currentWarrior]);
			
			if(warriors[currentWarrior].isDead()){
				System.out.println(warriors[currentWarrior].getName() + " is dead.");
				currentWarrior++;
				totalWarriors--;
				if(currentWarrior >= warriors.length) break;
			}
		}
		
		if(!warriors[currentWarrior].isDead()){
			warriors[currentWarrior].attack(wizards[currentWizard]);
			
			if(wizards[currentWizard].isDead()){
				System.out.println(wizards[currentWizard].getName() + " is dead!");
				currentWizard++;
				totalWizards--;
				if(currentWizard >= wizards.length) break;
		}
	}
}
	
	if(currentWarrior >= warriors.length){
		System.out.println("Wizards win the war with " + totalWizards + " left in their army!");
	}
	else{
		System.out.println("Warriors win the war with " + totalWarriors + " left in their army!");	
	}
  }
}

