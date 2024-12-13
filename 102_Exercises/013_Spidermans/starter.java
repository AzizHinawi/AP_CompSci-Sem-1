/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Spiderman test = new Spiderman("Bob");
		test.setAge(32);
		test.setVillain("Joe");

		Spiderman two = new Spiderman("Tom", 27, "Electro");
		System.out.println("The first sppiderman on the list is: " + test.getActor() + " and he is " + test.getAge() + " years old.");
		Spiderman three = new Spiderman("Andrew", 67);
		three.setVillain("Green Goblin");
		
		System.out.println("The villain is: " + three.getVillain());
		three.fight();
		three.printArt();
	}
}
