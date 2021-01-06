package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int rooms = 10;
		Product[] vect = new Product[rooms];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();	
			sc.nextLine();
			System.out.println("Rent #" + i +":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Product(name, email, room);
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i=0; i<rooms; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i].getName() + ", " + vect[i].getEmail());
			}		
		}
		
		sc.close();
	}

}
