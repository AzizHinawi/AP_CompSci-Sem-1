/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Please enter a day of the week (0 - Sunday, 1 - Monday, 2 - Tuesday, 3 - Wednesday, 4 - Thursday, 5 - Friday, 6 - Saturday): ");
	int day = sc.nextInt();
	
	String alarm = "10:00 am";
	String alarm2 = "7:00 am";

 if(day == 0)
	{
	System.out.println("Since it is a weekend, you can wake up around  "+alarm+"!");
	}
	else if(day == 6)
	{
	System.out.println("Since it is a weekend,  you will be able to wake up around  "+alarm+"!");
	}
	else if(day >= 1 && day <= 5)
	{
		System.out.println("Sorry, unfortunately it is a weekday, which means you'll need to wake up at "+alarm2+"...");
	}
	else
	{
		System.out.println("Sorry, that isn't a day, please try again.");
	}






	} 
}
