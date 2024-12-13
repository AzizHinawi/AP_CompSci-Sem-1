/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		
	int [] arr = new int[20];
	
	for(int i = 0; i < arr.length; i++){
		arr[i] = (int)(Math.random()*10)+1;
	}
	
	System.out.println("Here are the given 20 numbers:");
	for(int i = 0; i < arr.length; i++){
		System.out.print(arr[i] + " ");
	}
	
	System.out.println(" ");
	System.out.println("----------------------------------------");
	
	
	int targetNumber = (int)(Math.random()*10)+1;
	System.out.println("The random number to look for in this set is: "+targetNumber);
	
	int count = 0;
	
	for(int i = 0; i < arr.length; i++){
		if(arr[i] == targetNumber){
			System.out.println("Duplicate found in index " + i);
			count++;
		}
	}
	System.out.println("The total number of duplicates for " + targetNumber + " is " + count);
	
	System.out.println("----------------------------------------");
	
	System.out.println("Going to look for two in a row: ");
	for (int i = 0; i < arr.length; i++){
		if(arr[i] == arr[i + 1]){
			System.out.println("Two in a row found at the indexes " + i + " and " + (i + 1) + ". The number that was found is " + arr[i]);
			return;
		}
	}
	}
}

