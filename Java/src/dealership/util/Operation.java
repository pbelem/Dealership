package dealership.util;

import java.util.Scanner;

import dealership.entities.Seller;

public class Operation {

	private static Scanner sc = new Scanner(System.in);

	private static Seller seller;

	public static void registerSeller() {

		System.out.println("Enter the seller's name");
		String nameSeller = sc.nextLine();

		System.out.println("Enter the sellers's CPF");
		Long CPFseller = sc.nextLong();

		seller = new Seller(CPFseller, nameSeller);
	}
	
	public static void registerCustomer() {
		
		System.out.println("Enter the customer's name");
		String nameCustomer = sc.nextLine();
		
		System.out.println("Enter the customer's cpf");
	}

}
