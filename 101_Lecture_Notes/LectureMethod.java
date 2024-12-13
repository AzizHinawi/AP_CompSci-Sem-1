/* 
    Lecture note example - Methods
*/

class LectureMethod{
    
    public static void main(String args[]) {
        printAnimal();
        
        greeting("Matthew");
        greeting("Amberdingus");
        greeting("Taqquurias#");
        
        double newSalary = raise(500, 5);
        
        
       newSalary = raise(newSalary+1000, 6);
       newSalary = raise(newSalary+1000, 6);
       newSalary = raise(newSalary, 6);
       newSalary = raise(newSalary, 6);
       newSalary = raise(newSalary, 6);
       newSalary = raise(newSalary, 6);
       newSalary = raise(newSalary, 6);
       newSalary = raise(newSalary, 6);
       newSalary = raise(newSalary, 6);
       System.out.println(newSalary);
      
	}
	
	private static double raise(double salary, int percent){
	   double amount = salary + (salary * (percent/100.0));
	   return amount;
	}
	
	public static void greeting(String name){
	    System.out.println("Salutations, "+name);
	}
	
	public static void printAnimal(){
	System.out.println("  /`|   &&.");
	System.out.println("    `-\\`-&&&&&.");
	System.out.println("       \\&&&&&&&\\");
	System.out.println("         /&&#&& \\");
	System.out.println("        / |   |\\  x");
	System.out.println("         \\ |  / /");
	return;
	               

	}
	

	
}