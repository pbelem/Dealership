package dealership.util;

import java.util.Scanner;

import dealership.database.InsertData;
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
        Seller seller = registerSeller();
        Customer customer = registerCustomer();
        Sale sale = registerSale(customer, seller);

        byte itemSale = registerTypeSale(sale);

        switch (itemSale) {
            case 1:
                PartCar partCar = registerPartCar();
                InsertData.insertPartCar(partCar);
                break;
            case 2:
                Car car = registerCar();
                InsertData.insertCar(car);
                break;
            case 3:
                Car serviceCar = registerCar();
                InsertData.insertCar(serviceCar);
                Mechanic mechanic = registerMechanic();
                InsertData.insertMechanic(mechanic);
                Service service = registerService(serviceCar, customer, mechanic);
                InsertData.insertService(service);
                break;
        }
    }

    public static Seller registerSeller() {
        System.out.println("Enter the seller's name");
        String nameSeller = sc.nextLine();

        System.out.println("Enter the seller's CPF");
        Long CPFseller = sc.nextLong();
        sc.nextLine();

        Seller seller = new Seller(CPFseller, nameSeller);
        InsertData.insertSeller(seller);
        return seller;
    }

    public static Customer registerCustomer() {
        System.out.println("Enter the customer's name");
        String nameCustomer = sc.nextLine();

        System.out.println("Enter the customer's cpf");
        Long CPFcustomer = sc.nextLong();
        sc.nextLine();

        Customer customer = new Customer(CPFcustomer, nameCustomer);
        InsertData.insertCustomer(customer);
        return customer;
    }

    public static Sale registerSale(Customer customer, Seller seller) {
        System.out.println("Enter the sale's date");
        String saleDate = sc.nextLine();

        Sale sale = new Sale(saleDate, customer, seller);
        InsertData.insertSale(sale);
        return sale;
    }

    public static byte registerTypeSale(Sale sale) {
        System.out.println("Enter the sale's item");
        byte itemSale = sc.nextByte();
        while (itemSale < 0 || itemSale > 3) {
            System.out.println("Choose a valid answer");
            itemSale = sc.nextByte();
        }

        TypeSale typeSale = new TypeSale(sale, itemSale);
        InsertData.insertTypeSale(typeSale);
        return itemSale;
    }

    public static PartCar registerPartCar() {
        System.out.println("Enter part car's serial number");
        Long serialNumberPartCar = sc.nextLong();
        sc.nextLine();
        
        System.out.println("Enter part car's name");
        String partCarName = sc.nextLine();

        System.out.println("Enter part car's price");
        Double partCarPrice = sc.nextDouble();

        PartCar partCar = new PartCar(serialNumberPartCar, partCarName, partCarPrice);
        return partCar;
    }

    public static Car registerCar() {
        System.out.println("Enter car's chassi");
        String chassi = sc.nextLine();

        System.out.println("Enter car's model");
        String carModel = sc.nextLine();

        System.out.println("Enter car's year");
        short carYear = sc.nextShort();
        sc.nextLine(); // Consumir a quebra de linha pendente
        System.out.println("Enter car's color");
        String carCollor = sc.nextLine();

        System.out.println("Enter car's price");
        Double carPrice = sc.nextDouble();

        Car car = new Car(chassi, carModel, carYear, carCollor, carPrice);
        return car;
    }

    public static Service registerService(Car car, Customer customer, Mechanic mechanic) {
        System.out.println("Enter service's name");
        String nameService = sc.nextLine();

        System.out.println("Enter service's date");
        String dateService = sc.nextLine();

        System.out.println("Enter service's price");
        Double priceService = sc.nextDouble();

        Service service = new Service(nameService, dateService, priceService, car, customer, mechanic);
        return service;
    }

    public static Mechanic registerMechanic() {
        System.out.println("Enter mechanic's CPF");
        Long CPF_mechanic = sc.nextLong();
        sc.nextLine();
        
        System.out.println("Enter mechanic's name");
        String nameMechanic = sc.nextLine();

        Mechanic mechanic = new Mechanic(CPF_mechanic, nameMechanic);
        return mechanic;
    }
}

   