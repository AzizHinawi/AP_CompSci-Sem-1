/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
Scanner sc = new Scanner(System.in);
System.out.print("Please put in your name: ");
String name = sc.nextLine();
System.out.print("How many times would you want to see your name repeated? ");
int times = sc.nextInt();

int y = 0;

while(true)
{
	System.out.println(name);
	
	y=y+1;
	
	if(y == times)
	{
		break;
	}
	
}
	
		
	}
}
