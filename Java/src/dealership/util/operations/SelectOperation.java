package dealership.util.operations;

import java.util.Scanner;

import dealership.database.data.SelectData;

public class SelectOperation {

    private static final Scanner sc = new Scanner(System.in);

    public static void selectOperation() {
        System.out.println("Selecione a operação de consulta:");
        System.out.println("1. Consultar vendedor por CPF");
        System.out.println("2. Listar todos os vendedores");
        System.out.println("3. Consultar cliente por CPF");
        System.out.println("4. Listar todos os clientes");
        System.out.println("5. Consultar carro por chassi");
        System.out.println("6. Listar todos os carros");
        System.out.println("7. Consultar serviço por ID");
        System.out.println("8. Listar todos os serviços");
        System.out.println("9. Consultar peça de carro por número de série");
        System.out.println("10. Listar todas as peças de carro");
        System.out.println("11. Consultar venda por ID");
        System.out.println("12. Listar todas as vendas");

        int option = sc.nextInt();
        sc.nextLine(); 

        switch (option) {
            case 1 -> selectSellerByCpf();
            case 2 -> listAllSellers();
            case 3 -> selectCustomerByCpf();
            case 4 -> listAllCustomers();
            case 5 -> selectCarByChassi();
            case 6 -> listAllCars();
            case 7 -> selectServiceById();
            case 8 -> listAllServices();
            case 9 -> selectPartCarBySerialNumber();
            case 10 -> listAllPartCars();
            case 11 -> selectSaleById();
            case 12 -> listAllSales();
            default -> System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
        }
    }

    private static void selectSellerByCpf() {
        System.out.println("Digite o CPF do vendedor que deseja consultar:");
        long cpfSeller = sc.nextLong();
        SelectData.selectSeller(cpfSeller);  
    }

    private static void listAllSellers() {
        SelectData.selectAllSellers();  
    }

    private static void selectCustomerByCpf() {
        System.out.println("Digite o CPF do cliente que deseja consultar:");
        long cpfCustomer = sc.nextLong();
        SelectData.selectCustomer(cpfCustomer);  
    }

    private static void listAllCustomers() {
        SelectData.selectAllCustomers();  
    }

    private static void selectCarByChassi() {
        System.out.println("Digite o chassi do carro que deseja consultar:");
        String chassi = sc.nextLine();
        SelectData.selectCar(chassi);  
    }

    private static void listAllCars() {
        SelectData.selectAllCars(); 
    }

    private static void selectServiceById() {
        System.out.println("Digite o ID do serviço que deseja consultar:");
        int idService = sc.nextInt();
        SelectData.selectService(idService);  
    }

    private static void listAllServices() {
        SelectData.selectAllServices();  
    }

    private static void selectPartCarBySerialNumber() {
        System.out.println("Digite o número de série da peça de carro que deseja consultar:");
        int serialNumber = sc.nextInt();
        SelectData.selectPartCar(serialNumber);  
    }

    private static void listAllPartCars() {
        SelectData.selectAllPartCars();  
    }

    private static void selectSaleById() {
        System.out.println("Digite o ID da venda que deseja consultar:");
        int idSale = sc.nextInt();
        SelectData.selectSale(idSale);  
    }

    private static void listAllSales() {
        SelectData.selectAllSales(); 
    }
}
