/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input an integer: ");
		int num1 = sc.nextInt();
		System.out.print("Pleae input a second integer: ");
		int num2 = sc.nextInt();
		
		System.out.println(" ");
		
		if(num1 % 2 == 0){
			System.out.println(num1+" is divisble by 2! This means that your number is even..");
		}
		else{
			System.out.println(num1+" is not divisble by 2! This means that your number is odd..");
		}
		
		if(num1 % 3 == 0 && num1 % 4 == 0 && num1 % 5 == 0){
        	System.out.println(num1+" is divisble by 3, 4 and 5!");
        }
		else if (num1 % 3 == 0 ) {
            System.out.println(num1 + " is only divisible by 3!");
        } 
        else if(num1 % 4 == 0) {
        	 System.out.println(num1 + " is only divisible by 4!");
        }
        else if(num1 % 5 == 0) {
        	 System.out.println(num1 + " is only divisible by 5!");
        }
        else{
        	System.out.println(num1+" is not divisible by 3, 4 and 5!");
        }
		
		System.out.println(" ");	
	
		if(num2 % 2 == 0){
			System.out.println(num2+" is divisble by 2! This means that your number is even..");
		}
		else{
			System.out.println(num2+" is not divisble by 2! This means that your number is odd..");
		}
		
		if(num2 % 3 == 0 && num2 % 4 == 0 && num2 % 5 == 0){
        	System.out.println(num2+" is divisble by 3, 4 and 5!");
        }
        else if(num2 % 3 == 0){
        	System.out.println(num2+" is divisible only by 3!");
        }
        else if(num2 % 4 == 0) {
            System.out.println(num2 + " is divisible only by 4!");
        }
        else if(num2 % 5 == 0) {
            System.out.println(num2 + " is divisible only by 5!");
        }
        else{
        	System.out.println(num2+" is not divisible by 3, 4 and 5!");
        }
		
	}
}
