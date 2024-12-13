/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}
	
	public static int randAge(){
		return (int)(Math.random()*100);
	}

	public static void main(String args[]) {

		PooleDwarf dwarf1 = new PooleDwarf(randName(), randAge());
        PooleDwarf dwarf2 = new PooleDwarf(randName(), randAge());
        PooleDwarf dwarf3 = new PooleDwarf(randName(), randAge());
        PooleDwarf dwarf4 = new PooleDwarf(randName(), randAge());
        PooleDwarf dwarf5 = new PooleDwarf(randName(), randAge());
        PooleDwarf dwarf6 = new PooleDwarf(randName(), randAge());
        PooleDwarf dwarf7 = new PooleDwarf(randName(), randAge());

        String firstDwarfName = dwarf1.getName();
        int d = 0;

        if (dwarf2.isSameName(firstDwarfName)) d++;
        if (dwarf3.isSameName(firstDwarfName)) d++;
        if (dwarf4.isSameName(firstDwarfName)) d++;
        if (dwarf5.isSameName(firstDwarfName)) d++;
        if (dwarf6.isSameName(firstDwarfName)) d++;
        if (dwarf7.isSameName(firstDwarfName)) d++;

        System.out.println("First Dwarf's name: " + firstDwarfName + "\n And it has a total of: "+d+" duplicate(s)!");
		}
	}

