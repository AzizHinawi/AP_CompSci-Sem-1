/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
        // Your Code Goes here!
	Scanner sc = new Scanner(System.in);
	System.out.println("Dolhpins are going to start invading the world using symphony.");
	System.out.println("What ways would you like them to start invading the world?");
	System.out.println("1. The dolphins unleash a mesmerizing symphony that resonates with the human mind, putting people into a trance. While in this state, humans become more susceptible to dolphin commands, leading to a peaceful takeover of coastal cities as humans unknowingly begin to build underwater habitats.\n");
    System.out.println("2. The dolphins’ symphony calls forth all marine creatures, creating a massive, coordinated uprising against human activities that harm the oceans. As ocean life rises up, they use the power of the symphony to disrupt shipping routes and coastal industries, forcing humanity to confront the ecological consequences of their actions. \n");
    System.out.println("3.  The dolphins infiltrate human society through music festivals, where they perform enchanting melodies that captivate audiences. As their music becomes popular, they subtly implant messages about ocean preservation and dolphin rights, slowly gaining influence over human culture and politics. \n");
   System.out.print("Please choose a way: ");
   
   int way = sc.nextInt();
   if(way == 1){
       System.out.println("You chose that the dolphinsins would uleash great symphony.");
       System.out.println("What would they use to unleash symphony? ");
       System.out.println("1. A violin");
       System.out.println("2. A flute");
       System.out.println("3. Their mesmerizing bodies");
       int instrument = sc.nextInt();
       System.out.println("You have chosen number "+instrument+"! Such a great story");
   }
   else if(way == 2){
       System.out.println("You chose that the dolphins would call all of the marine creatures");
       System.out.println("What animals would they exactly call?");
       System.out.println("1. Seals");
       System.out.println("2. Whales");
       System.out.println("3. Fish");
       int mammal = sc.nextInt();
       System.out.println("You chose number "+mammal+"! Great story you have here.");
   }
   else if(way == 3){
       System.out.println("You chose that they infiltrate society through musci festivals.");
       System.out.println("What way would you like them to infiltrate?");
       System.out.println("1. They dance their way in");
       System.out.println("2. They blend in with the people");
       System.out.println("3. They just don't care and kill all the humans");
       int way2 = sc.nextInt();
       System.out.println("You chose number "+way2+"! Great choice! This story is amazing.");
   }
   else{
       System.out.println("You haven't chosen anything, please try again");
       
   }
   
    }
}