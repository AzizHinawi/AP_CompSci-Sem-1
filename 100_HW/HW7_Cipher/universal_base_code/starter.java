/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	String message1 = "6v lvp u5vuy5 y1z5 qpsqy5r";
	String decoded1 = Cipher.encode(message1);
	System.out.println("Decoded 1: "+decoded1);
	
	String message2 = "sv8vq17r 1r q25 85rq";
	String decoded2 = Cipher.encode(message2);
	System.out.println("Decoded 2: " + decoded2);
	
	String message3 = "q25 z5l qv wpx85s f 1r gg";
	String decoded3 = Cipher.encode(message3);
	System.out.println("Decoded 3: " + decoded3);
	
	int key1 = 33;
	String message4 = "z8r8v 6yzzc 64r8 oys sx z8r8v 6y4z6 ty 18t oys 9yqz";
	String decoded4 = Cipher.keyedEncode(message4, key1);
	System.out.println("Decoded 4: " + decoded4);
	
	String message5 = "29y4 v4 v2q9w1r 05sr5l wpx85s 1r z5l qv d";
	String decoded5 = Cipher.encode(message5);
	System.out.println("Decoded 5: " + decoded5);
	
	int key2 = 8;
	String message6 = "a8 1oy 92 1kx rxdj in 4";
	String decoded6 = Cipher.keyedEncode(message6, key2);
	System.out.println("Decoded 6: " + decoded6);
	
	int key3 = 13;
	int key4 = 29;
	String message7 = "549q94u8 q3t sxys0u3 q7u 2e vqb47y9u bq7yqr1u 3q2u8";
	String decoded7 = Cipher.keyedEncode(message7, key3);
	String decoded7A = Cipher.keyedEncode(decoded7, key4);
	System.out.println("Decoded 7: " + decoded7A);
	
	String message8 = "lvpo5 rp775rr4pyyl 7vxuy5q56 q25 41srq r57q1vw";
	String decoded8 = Cipher.encode(message8);
	System.out.println("Decoded 8: " + decoded8);
	
	System.out.println("---------------------------------------");
	
	String message9 = "u4y i1e i5 i6ita5c 314c1i66e1 i5f by6i5 hea5c zbi58 u4y";
	String decoded9 = Cipher.encode(message9);
	System.out.println("Decoded 9: "+ decoded9);
	
	String message10 = "amlb mfhp7fcj jlgq fo tap s9a bjlslql aflipa lb hlg9b 210z t9ct";
	String decoded10 = Cipher.encode(message10);
	System.out.println("Decoded 10: "+ decoded10);
	
	
	System.out.println("---------------------------------------");
        
        
        System.out.print("Enter a message to encode: ");
        String message = sc.nextLine();
        System.out.print("Enter the key, must be an integer: ");
        int key = sc.nextInt();
        String encodedMessage = Cipher.keyedEncode(message, key);
        System.out.println("Encoded Message: " + encodedMessage);
        
	}
}
