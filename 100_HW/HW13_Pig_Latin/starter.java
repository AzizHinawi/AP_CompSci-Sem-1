/*
   * Author:
   * Date:
   * Collaborator(s):
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String sentence = sc.nextLine();
		
		while(true){
            if(sentence.indexOf(" ") == -1){
                System.out.println(pigLatin(sentence));
                break;
            }
            int space = sentence.indexOf(" ");
            String word = sentence.substring(0, space);
            
            System.out.print(pigLatin(word) + " ");
            
            sentence = sentence.substring(space+1);
        }
	}
	
	public static String pigLatin(String word){
	    String vowels = "aeiouAEIOU";
	    String result = "";
	    
	    if(vowels.indexOf(word.substring(0, 1)) != -1){
	        result = word + "-way";
	    }
	    else{
	        int i = 0;
	        while(i < word.length() && vowels.indexOf(word.substring(i, i+1)) == -1){
	            i++;
	        }
	    
	    if(i > 0){
	        String c = word.substring(0, i);
	        String r = word.substring(i);
	        result = r + c + "-ay";
	        }
	    }
	    return result;
	    
	}
}

