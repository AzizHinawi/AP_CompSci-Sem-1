/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class Spiderman {
	String actor;
	int age;			
	String villain;
	
	public Spiderman(){
		actor = "unknown";
		age = 0;
		villain = "unknown";
	}
	
	public Spiderman(String a){
		actor = a;
		age = 0;
		villain = "unknown";
	}
	
	public Spiderman(int a){
		actor = "unknown";
		age = a;
		villain = "unknown";
	}
	
	public Spiderman(String a, int b){
		actor = a;
		age = b;
		villain = "unknown";
	}
	
	public Spiderman(int a, String v){
		actor = "unknown";
		age = a;
		villain = v;
	}
	
	public Spiderman(String act, int a, String v){
		actor = act;
		age = a;
		villain = v;
	}
	
	// ---------------------------------------
	
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge
	public String getActor(){
		return actor;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getVillain(){
		return villain;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void setVillain(String villain){
		this.villain = villain;
	}
	
	public void setActor(String actor){
		this.actor = actor;
	}

	// ---------------------------------------
	
	public void fight(){
		System.out.println("Spidey shoots his web at " + this.villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
