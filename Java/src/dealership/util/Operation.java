package dealership.util;

import java.util.Scanner;

import dealership.entities.Car;
import dealership.entities.Customer;
import dealership.entities.Mechanic;
import dealership.entities.PartCar;
import dealership.entities.Sale;
import dealership.entities.Seller;
import dealership.entities.Service;
import dealership.entities.TypeSale;

public class Operation {

	private static Scanner sc = new Scanner(System.in);

	public static void dealershipSale() {

		registerSeller();
		registerCustomer();
		registerSale();

		byte itemSale = registerTypeSale();
		
		switch(itemSale) {
		
		case 1:
			registerPartCar();
			break;
		case 2:
			registerCar();
			break;
		case 3:
			registerCar();
			registerMechanic();
			registerService();
			break;
		}
		
	}

	public static void registerSeller() {

		System.out.println("Enter the seller's name");
		String nameSeller = sc.nextLine();

		System.out.println("Enter the sellers's CPF");
		Long CPFseller = sc.nextLong();

		Seller seller = new Seller(CPFseller, nameSeller);
	}

	public static void registerCustomer() {

		System.out.println("Enter the customer's name");
		sc.next();
		String nameCustomer = sc.nextLine();

		System.out.println("Enter the customer's cpf");
		Long CPFcustomer = sc.nextLong();

		Customer customer = new Customer(CPFcustomer, nameCustomer);
	}

	public static void registerSale() {

		System.out.println("Enter the sale's date");
		sc.next();
		String saleDate = sc.nextLine();

		Customer customer = new Customer();
		Seller seller = new Seller();

		Sale sale = new Sale(saleDate, customer, seller);
	}

	public static byte registerTypeSale() {

		System.out.println("Enter the sale's item");
		byte itemSale = sc.nextByte();

		if (itemSale < 0 || itemSale > 3) {
			while (itemSale < 0 || itemSale > 3) {
				System.out.println("Choose a valid answser");
				itemSale = sc.nextByte();
			}
		}

		Sale sale = new Sale();
		TypeSale typeSale = new TypeSale(sale, itemSale);
		return itemSale;

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
		
		System.out.println("Enter car's chassi");
		String chassi = sc.nextLine();
		
		System.out.println("Enter car's model");
		String carModel = sc.nextLine();
		
		System.out.println("Enter car's year");
		short carYear = sc.nextShort();
		
		System.out.println("Enter car's collor");
		String carCollor = sc.nextLine();
		
		System.out.println("Enter car's price");
		Double carPrice = sc.nextDouble();
		
		Car car = new Car(chassi, carModel, carYear, carCollor, carPrice);
	}
	
	public static void registerService() {
		
		System.out.println("Enter service's name");
		String nameService= sc.nextLine();
		
		System.out.println("Enter service's date");
		String dateService = sc.nextLine();
		
		System.out.println("Enter service's price");
		Double priceService = sc.nextDouble();
		
		Car car = new Car();
		Customer customer = new Customer();
		Mechanic mechanic = new Mechanic();
		
		Service service = new Service(nameService, dateService, priceService, car, customer, mechanic);
		
	}
	
	public static void registerMechanic() {
		
		System.out.println("Enter mechanic's cpf");
		Long CPF_mechanic = sc.nextLong();
		
		System.out.println("Enter mechanic's name");
		String nameMechanic = sc.nextLine();
		
		Mechanic mechanic = new Mechanic(CPF_mechanic, nameMechanic);
		
	}

}
