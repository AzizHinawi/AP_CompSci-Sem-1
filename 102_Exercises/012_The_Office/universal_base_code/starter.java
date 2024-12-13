/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		Employee Dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Dwight.employeeToString();
		Employee Jim = new Employee(2474,"Jim","Halpert",4416.66);
		Jim.employeeToString();
		Employee Pam = new Employee(2011,"Pam","Beesly",2250);
		Pam.employeeToString();
		Employee Sigma = new Employee(6969,"Alpha","Sigma",4200);
		Sigma.employeeToString();
	
		System.out.println("ORIGINAL SALARIES:");
		System.out.println("-------------------------------");
		System.out.print("Michael's Annual Salary: ");
		System.out.println(michael.getAnnualSalary());
		System.out.print("Dwight's Annual Salary: ");
		System.out.println(Dwight.getAnnualSalary());
		System.out.print("Jim's Annual Salary: ");
		System.out.println(Jim.getAnnualSalary());
		System.out.print("Pam's Annual Salary: ");
		System.out.println(Pam.getAnnualSalary());
		System.out.print("Sigma's Annual Salary: ");
		System.out.println(Sigma.getAnnualSalary());
		System.out.println("--------------------------------");
		System.out.println(" ");
		
		michael.raiseSalary(100);
		Dwight.raiseSalary(100);
		Jim.raiseSalary(100);
		Pam.raiseSalary(100);
		Sigma.raiseSalary(100);
		
		System.out.println("RAISED SALARIES: ");
		System.out.println("--------------------------------");
		System.out.print("Michael's New Annual Salary: ");
		System.out.println(michael.getAnnualSalary());
		System.out.print("Dwight's New Annual Salary: ");
		System.out.println(Dwight.getAnnualSalary());
		System.out.print("Jim's New Annual Salary: ");
		System.out.println(Jim.getAnnualSalary());
		System.out.print("Pam's New Annual Salary: ");
		System.out.println(Pam.getAnnualSalary());
		System.out.print("Sigma's New Annual Salary: ");
		System.out.println(Sigma.getAnnualSalary());
		System.out.println("--------------------------------");
	
	}
}
