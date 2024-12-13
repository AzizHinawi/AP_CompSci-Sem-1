/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Please put in a whole number: ");
	int number1 = sc.nextInt();
	System.out.println("The next 5 numbers after "+number1+" are:");
	System.out.print(number1+1+", ");
	System.out.print(number1+2+", ");
	System.out.print(number1+3+", ");
	System.out.print(number1+4+", ");
	System.out.println(number1+5);
	System.out.println("Here are the next multiples of "+number1+": ");
	System.out.print(number1*2+", ");
	System.out.print(number1*3+", ");
	System.out.print(number1*4+", ");
	System.out.print(number1*5+", ");
	System.out.println(number1*6);
	double x = number1;
	System.out.println("Here is "+x+ " divided by 100: ");
	System.out.println(x/100);
	System.out.println("Here is "+number1+" divided by 10: ");
	System.out.print(x/10);
	

	}
}
