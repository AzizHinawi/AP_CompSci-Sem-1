/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Please put in an integer: ");
	int a = sc.nextInt();
	System.out.println("Got it! The numbers less than "+a+" are:");
	printPrimes(a);
	
	
	}
	
	
	public static boolean checkPrime(int number){
		if(number < 2){
			return false;
		}
		int division = 2; 
		while(division < number){
			if(number % division == 0){
				return false;
			}
			division++;
		}
		return true;
	}
	
	
	
	public static void printPrimes(int amount){
		int division = 2;
		while(division < amount){
			if (checkPrime(division)){
				System.out.println(division);
			}
			division++;
		}
	}
	
	
	
}

