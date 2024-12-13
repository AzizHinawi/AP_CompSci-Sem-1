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
    
    System.out.println("Please enter a sentence: ");
    
    String sentence = sc.nextLine();
    
    String reversedSentence = "";
    
    while(true){
    	if(sentence.indexOf(" ") == -1){
    		if(reversedSentence.equals("")){
    			reversedSentence = sentence;
    		}
    		else{
    			reversedSentence = sentence + " " + reversedSentence;
    		}
    		break;
    	}
    	
    	int space = sentence.indexOf(" ");
        
        String word = sentence.substring(0, space);
        
        if(reversedSentence.equals("")){
        	reversedSentence = word;
        }
        else{
        	reversedSentence = word + " " + reversedSentence;
        }
            
        sentence = sentence.substring(space+1);
        
        
    }
    
	System.out.println("Reversed Sentence is: " + reversedSentence);

		
	}
}
