/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] arr = new int[1001];
		 int x = 3;
		for(int i = 0; i < 1001; i++){
		arr[i] = x;
		 System.out.println(arr[i]);
		 x = x + 3;
	}
	
	System.out.println("-----------------------------");
		
		int [] arr2 = new int[1001];
		int z = 1000;
		for(int y = 0; y < 1001; y++){
		arr2[y] = z;
		System.out.println(arr2[y]);
		z--;	
		}
	}
}
