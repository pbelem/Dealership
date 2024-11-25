package dealership.util;

import java.util.Scanner;

import dealership.entities.Customer;
import dealership.entities.PartCar;
import dealership.entities.Sale;
import dealership.entities.Seller;
import dealership.entities.TypeSale;

public class Operation {

	private static Scanner sc = new Scanner(System.in);

	public static void registerSeller() {

		System.out.println("Enter the seller's name");
		String nameSeller = sc.nextLine();

		System.out.println("Enter the sellers's CPF");
		Long CPFseller = sc.nextLong();

		Seller seller = new Seller(CPFseller, nameSeller);
	}

	public static void registerCustomer() {

		System.out.println("Enter the customer's name");
		String nameCustomer = sc.nextLine();

		System.out.println("Enter the customer's cpf");
		Long CPFcustomer = sc.nextLong();

		Customer customer = new Customer(CPFcustomer, nameCustomer);
	}

	public static void registerSale() {

		System.out.println("Enter the sale's date");
		String saleDate = sc.nextLine();

		Customer customer = new Customer();
		Seller seller = new Seller();

		Sale sale = new Sale(saleDate, customer, seller);
	}

	public static void registerTypeSale() {

		System.out.println("Enter the sale's item");
		byte itemSale = sc.nextByte();
		while (itemSale < 0 || itemSale > 3) {
			System.out.println("Choose a valid answser");
			itemSale = sc.nextByte();
		}

		Sale sale = new Sale();
		TypeSale typeSale = new TypeSale(sale, itemSale);
	}
	
	public static void registerPartCar() {
		
		System.out.println("Enter part car's serial number");
		Long serialNumberPartCar = sc.nextLong();
		
		System.out.println("Enter part car's name");
		String partCarName = sc.nextLine();
		
		System.out.println("Enter part car's price");
		Double partCarPrice = sc.nextDouble();
		
		PartCar partCar = new PartCar(serialNumberPartCar, partCarName, partCarPrice);
	}
	
	public static void registerCar() {
		
	}

}
