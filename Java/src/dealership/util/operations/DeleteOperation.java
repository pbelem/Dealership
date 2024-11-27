package dealership.util.operations;

import java.util.Scanner;

import dealership.database.data.DeleteData;

public class DeleteOperation {

	 private static Scanner sc = new Scanner(System.in);

	    public static void deleteOperation() {
	        System.out.println("Selecione a opção de exclusão:");
	        System.out.println("1. Remover Vendedor");
	        System.out.println("2. Remover Cliente");
	        System.out.println("3. Remover Carro");
	        System.out.println("4. Remover Peça de Carro");
	        System.out.println("5. Remover Serviço");
	        System.out.println("6. Remover Mecânico");
	        System.out.println("7. Remover Venda");
	        System.out.println("8. Remover Tipo de Venda");
	        System.out.println("9. Remover Endereço");

	        int option = sc.nextInt();
	        sc.nextLine(); 

	        switch (option) {
	            case 1 -> deleteSeller();
	            case 2 -> deleteCustomer();
	            case 3 -> deleteCar();
	            case 4 -> deletePartCar();
	            case 5 -> deleteService();
	            case 6 -> deleteMechanic();
	            case 7 -> deleteSale();
	            case 8 -> deleteTypeSale();
	            case 9 -> deleteAddress();
	            default -> System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
	        }
	    }

	    private static void deleteSeller() {
	        System.out.println("Digite o CPF do vendedor que deseja excluir:");
	        String cpfSeller = sc.nextLine();
	        DeleteData.deleteSeller(cpfSeller);
	    }

	    private static void deleteCustomer() {
	        System.out.println("Digite o CPF do cliente que deseja excluir:");
	        String cpfCustomer = sc.nextLine();
	        DeleteData.deleteCustomer(cpfCustomer);
	    }

	    private static void deleteCar() {
	        System.out.println("Digite o chassi do carro que deseja excluir:");
	        String chassi = sc.nextLine();
	        DeleteData.deleteCar(chassi);
	    }

	    private static void deletePartCar() {
	        System.out.println("Digite o número de série da peça de carro que deseja excluir:");
	        int serialNumber = sc.nextInt();
	        sc.nextLine();
	        DeleteData.deletePartCar(serialNumber);
	    }

	    private static void deleteService() {
	        System.out.println("Digite o ID do serviço que deseja excluir:");
	        int idService = sc.nextInt();
	        sc.nextLine(); 
	        DeleteData.deleteService(idService);
	    }

	    private static void deleteMechanic() {
	        System.out.println("Digite o CPF do mecânico que deseja excluir:");
	        String cpfMechanic = sc.nextLine();
	        DeleteData.deleteMechanic(cpfMechanic);
	    }

	    private static void deleteSale() {
	        System.out.println("Digite o ID da venda que deseja excluir:");
	        int idSale = sc.nextInt();
	        sc.nextLine(); 
	        DeleteData.deleteSale(idSale);
	    }

	    private static void deleteTypeSale() {
	        System.out.println("Digite o ID do tipo de venda que deseja excluir:");
	        int idTypeSale = sc.nextInt();
	        sc.nextLine();
	        DeleteData.deleteTypeSale(idTypeSale);
	    }

	    private static void deleteAddress() {
	        System.out.println("Digite o ID do endereço que deseja excluir:");
	        int idAddress = sc.nextInt();
	        sc.nextLine(); 
	        DeleteData.deleteAddress(idAddress);
	    }

}