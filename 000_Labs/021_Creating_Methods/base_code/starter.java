/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {

	public static void toString(String a){
		System.out.println(a);
	}
	
	public static void toStringCombined(String b){
		System.out.println(b);
	}

	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	starter obj = new starter();
	
System.out.println("Write a sentence!");
String a = sc.nextLine();

System.out.println("Write a sentence!");
String b = sc.nextLine();

System.out.println(" ");

System.out.println("This is using the methods!");
obj.toString(a);
obj.toStringCombined(a+" "+b);


		
	}
}
