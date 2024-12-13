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
	int size = (int)(Math.random()*150)+51;
		
	int [] arr = new int[size];
		
	for(int i = 0; i < arr.length; i++){
		arr[i] = (int)(Math.random()*100)+1;
	}
		
	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;
	int sum = 0;
		
	for (int i = 0; i < arr.length; i++) {
        if (arr[i] < min) {
        min = arr[i];
        }
        else if (arr[i] > max) {
        max = arr[i];
        }
        sum = sum + arr[i]; 
	}

    System.out.println("The amount of elements: " + arr.length);
        
    System.out.println("The min value of the random numbers: " + min);
        
    System.out.println("The max value of the random numbers: " + max);
       
    int avg = sum / arr.length;
          
    System.out.println("The average value of the numbers: " + avg);
	
	
        }
}
       
		

