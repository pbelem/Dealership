package dealership.util.operations;

import java.util.Scanner;

import dealership.database.data.UpdateData;
import dealership.entities.Car;
import dealership.entities.Customer;
import dealership.entities.Mechanic;
import dealership.entities.PartCar;
import dealership.entities.Sale;
import dealership.entities.Seller;
import dealership.entities.Service;
import dealership.entities.TypeSale;

public class UpdateOperation {

    private static Scanner sc = new Scanner(System.in);

    public static void updateOperation() {
        System.out.println("What do you want to update?");
        System.out.println("1. Seller");
        System.out.println("2. Customer");
        System.out.println("3. Car");
        System.out.println("4. Part Car");
        System.out.println("5. Sale");
        System.out.println("6. Mechanic");
        System.out.println("7. Service");
        System.out.println("8. Type Sale");

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                updateSeller();
                break;
            case 2:
                updateCustomer();
                break;
            case 3:
                updateCar();
                break;
            case 4:
                updatePartCar();
                break;
            case 5:
                updateSale();
                break;
            case 6:
                updateMechanic();
                break;
            case 7:
                updateService();
                break;
            case 8:
                updateTypeSale();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    public static void updateSeller() {
        System.out.println("Enter the seller's CPF to update");
        Long CPFseller = sc.nextLong();
        sc.nextLine();

        System.out.println("Enter the new seller's name");
        String nameSeller = sc.nextLine();

        Seller seller = new Seller(CPFseller, nameSeller);
        UpdateData.updateSeller(seller);
    }

    public static void updateCustomer() {
        System.out.println("Enter the customer's CPF to update");
        Long CPFcustomer = sc.nextLong();
        sc.nextLine();

        System.out.println("Enter the new customer's name");
        String nameCustomer = sc.nextLine();

        Customer customer = new Customer(CPFcustomer, nameCustomer);
        UpdateData.updateCustomer(customer);
    }

    public static void updateCar() {
        System.out.println("Enter car's chassi to update");
        sc.next();
        String chassi = sc.nextLine();

        System.out.println("Enter car's new model");
        String carModel = sc.nextLine();

        System.out.println("Enter car's new year");
        short carYear = sc.nextShort();
        sc.nextLine();

        System.out.println("Enter car's new color");
        String carCollor = sc.nextLine();

        TypeSale typesale = new TypeSale();
        if (typesale.getSaleItem() == 1) {
            System.out.println("Enter car's new price");
            Double carPrice = sc.nextDouble();
            Car car = new Car(chassi, carModel, carYear, carCollor, carPrice);
            UpdateData.updateCar(car, typesale);
        } else {
            Car car = new Car(chassi, carModel, carYear, carCollor);
            UpdateData.updateCar(car, typesale);
        }
    }

    public static void updatePartCar() {
        System.out.println("Enter part car's serial number to update");
        Long serialNumberPartCar = sc.nextLong();
        sc.nextLine();

        System.out.println("Enter new part car's name");
        String partCarName = sc.nextLine();

        System.out.println("Enter new part car's price");
        Double partCarPrice = sc.nextDouble();

        PartCar partCar = new PartCar(serialNumberPartCar, partCarName, partCarPrice);
        UpdateData.updatePartCar(partCar);
    }

    public static void updateSale() {
        System.out.println("Enter the sale's ID to update");
        Long saleId = sc.nextLong();
        sc.nextLine();

        System.out.println("Enter the new sale's date");
        String saleDate = sc.nextLine();

        System.out.println("Enter the customer's CPF");
        Long customerCPF = sc.nextLong();
        sc.nextLine();

        System.out.println("Enter the seller's CPF");
        Long sellerCPF = sc.nextLong();
        sc.nextLine();

        Sale sale = new Sale(saleId, saleDate, customerCPF, sellerCPF);
        UpdateData.updateSale(sale);
    }

    public static void updateMechanic() {
        System.out.println("Enter mechanic's CPF to update");
        Long CPF_mechanic = sc.nextLong();
        sc.nextLine();

        System.out.println("Enter mechanic's new name");
        String nameMechanic = sc.nextLine();

        Mechanic mechanic = new Mechanic(CPF_mechanic, nameMechanic);
        UpdateData.updateMechanic(mechanic);
    }

    public static void updateService() {
        System.out.println("Enter service's ID to update");
        Long serviceId = sc.nextLong();
        sc.nextLine();

        System.out.println("Enter new service's name");
        String nameService = sc.nextLine();

        System.out.println("Enter new service's date");
        String dateService = sc.nextLine();

        System.out.println("Enter new service's price");
        Double priceService = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter car's chassi");
        String chassi = sc.nextLine();

        System.out.println("Enter customer's CPF");
        Long customerCPF = sc.nextLong();
        sc.nextLine();

        System.out.println("Enter mechanic's CPF");
        Long mechanicCPF = sc.nextLong();
        sc.nextLine();

        Service service = new Service(serviceId, nameService, dateService, priceService, chassi, customerCPF, mechanicCPF);
        UpdateData.updateService(service);
    }

    public static void updateTypeSale() {
        System.out.println("Enter type sale's ID to update");
        Long typeId = sc.nextLong();
        sc.nextLine();

        System.out.println("Enter new sale item (1 for Car, 2 for Part, 3 for Service)");
        byte itemSale = sc.nextByte();
        while (itemSale < 1 || itemSale > 3) {
            System.out.println("Choose a valid answer");
            itemSale = sc.nextByte();
        }

        TypeSale typeSale = new TypeSale(typeId, itemSale);
        UpdateData.updateTypeSale(typeSale);
    }
}
