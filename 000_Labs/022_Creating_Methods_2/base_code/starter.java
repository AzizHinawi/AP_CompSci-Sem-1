/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow(int a, int b){
		int x = a;
		int y = 1;
		while(true){
			if(y == b){
				break;
			}
			x = x*a;
			y = y+1;
		}
		return x;
	}
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Please enter a base number: ");
	int a = sc.nextInt();
	System.out.print("Please enter an exponent number: ");
	int b = sc.nextInt();
	
	System.out.print(pow(a, b));
	
	}
}
