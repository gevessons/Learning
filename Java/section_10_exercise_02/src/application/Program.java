package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		System.out.println();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Employee #" + i + ":");
			System.out.print("ID: ");
			int id = sc.nextInt();	
			sc.nextLine();		
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			System.out.println();
			list.add(new Employee(id, name, salary));
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp != null) {
			System.out.print("Enter the percentage: ");			
			double percentage = sc.nextDouble();			
			emp.increaseSalary(percentage);
		}
		else {
			System.out.println("This id does not exist!"); 
		}		
		
		System.out.println();
		System.out.println("List of employees: ");
		for (int i=0; i<n; i++) {
			System.out.println(list.get(i));
		}
		sc.close();
	}
}
