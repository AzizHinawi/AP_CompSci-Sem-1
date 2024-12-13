/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter anything and we'll output it with spaces inbetween each letter: ");
		String a = sc.nextLine();
		for(int i = 0; i < a.length(); i++){
			System.out.print(a.substring(i, i+1) + " ");
		}


		
	}
}
