package dealership.database.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import dealership.entities.Address;
import dealership.entities.Car;
import dealership.entities.Customer;
import dealership.entities.CustomerCard;
import dealership.entities.Mechanic;
import dealership.entities.PartCar;
import dealership.entities.Sale;
import dealership.entities.Seller;
import dealership.entities.Service;
import dealership.entities.TypeSale;

public class InsertData {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/DEALERSHIP_DATABASE";
		String user = "postgres";
		String password = "postgres";
		
		TypeSale typeSale = new TypeSale();

		try {
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();

			String sql =
			 "INSERT INTO TYPE_SALE (ID_TYPE_SALE, SALE_ITEM) VALUES (" +
			 typeSale.getIDTypeSale() + ", '" + typeSale.getSaleItem() + "')";
			
			stmt.executeUpdate(sql);

			System.out.println("Dados inseridos com sucesso!");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void insertAddress(Address address) {
	    String url = "jdbc:postgresql://localhost:5432/DEALERSHIP_DATABASE";
	    String user = "postgres";
	    String password = "postgres";

	    try {
	        Connection con = DriverManager.getConnection(url, user, password);
	        Statement stmt = con.createStatement();

	        String sql = "INSERT INTO ADDRESS (ID_ADDRESS, CPF_CUSTOMER, STATE, CITY, ZIP_CODE, STREET, NUMBER, COMPLEMENT) VALUES ("
	                + address.getIdAdress() + ", "
	                + address.getCPF_customer() + ", '"
	                + address.getState() + "', '"
	                + address.getCity() + "', "
	                + address.getZIP_code() + ", '"
	                + address.getStreet() + "', "
	                + address.getNumber() + ", '"
	                + address.getComplement() + "')";
	        
	        stmt.executeUpdate(sql);
	        System.out.println("Endereço inserido com sucesso!");

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	public static void insertCar(Car car, TypeSale typesale) {
	    String url = "jdbc:postgresql://localhost:5432/DEALERSHIP_DATABASE";
	    String user = "postgres";
	    String password = "postgres";

	    try {
	        Connection con = DriverManager.getConnection(url, user, password);
	        Statement stmt = con.createStatement();

	        String sql;
	        if (typesale.getSaleItem() == 1) {
	            sql = "INSERT INTO CAR (CHASSI, CAR_MODEL, CAR_YEAR, CAR_COLOR, CAR_PRICE) VALUES ('"
	                    + car.getChassi() + "', '"
	                    + car.getCarModel() + "', "
	                    + car.getCarYear() + ", '"
	                    + car.getCarCollor() + "', "
	                    + car.getCarPrice() + ")";
	        } else {
	            sql = "INSERT INTO CAR (CHASSI, CAR_MODEL, CAR_YEAR, CAR_COLOR) VALUES ('"
	                    + car.getChassi() + "', '"
	                    + car.getCarModel() + "', "
	                    + car.getCarYear() + ", '"
	                    + car.getCarCollor() + "')";
	        }

	        stmt.executeUpdate(sql);
	        System.out.println("Carro inserido com sucesso!");

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}


	public static void insertCustomer(Customer customer) {
	    String url = "jdbc:postgresql://localhost:5432/DEALERSHIP_DATABASE";
	    String user = "postgres";
	    String password = "postgres";

	    try {
	        Connection con = DriverManager.getConnection(url, user, password);
	        Statement stmt = con.createStatement();

	        String sql = "INSERT INTO CUSTOMER (CPF_CUSTOMER, NAME_CUSTOMER) VALUES ("
	                + customer.getCPF_customer() + ", '"
	                + customer.getNameCustomer() + "')";

	        stmt.executeUpdate(sql);
	        System.out.println("Cliente inserido com sucesso!");

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	public static void insertCustomerCard(CustomerCard customerCard) {
	    String url = "jdbc:postgresql://localhost:5432/DEALERSHIP_DATABASE";
	    String user = "postgres";
	    String password = "postgres";

	    try {
	        Connection con = DriverManager.getConnection(url, user, password);
	        Statement stmt = con.createStatement();

	        String sql = "INSERT INTO CUSTOMER_CARD (CARD_NUMBER, CARD_OWNER, CARD_VALID, CVV, CPF_CUSTOMER) VALUES ("
	                + customerCard.getCardNumber() + ", '"
	                + customerCard.getCardOwner() + "', '"
	                + customerCard.getCardValid() + "', "
	                + customerCard.getCVV() + ", "
	                + customerCard.getCPF_customer() + ")";

	        stmt.executeUpdate(sql);
	        System.out.println("Cartão do cliente inserido com sucesso!");

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	public static void insertMechanic(Mechanic mechanic) {
	    String url = "jdbc:postgresql://localhost:5432/DEALERSHIP_DATABASE";
	    String user = "postgres";
	    String password = "postgres";

	    try {
	        Connection con = DriverManager.getConnection(url, user, password);
	        Statement stmt = con.createStatement();

	        String sql = "INSERT INTO MECHANIC (CPF_MECHANIC, NAME_MECHANIC) VALUES ("
	                + mechanic.getCPF_mechanic() + ", '"
	                + mechanic.getNameMechanic() + "')";

	        stmt.executeUpdate(sql);
	        System.out.println("Mecânico inserido com sucesso!");

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	public static void insertPartCar(PartCar partCar) {
	    String url = "jdbc:postgresql://localhost:5432/DEALERSHIP_DATABASE";
	    String user = "postgres";
	    String password = "postgres";

	    try {
	        Connection con = DriverManager.getConnection(url, user, password);
	        Statement stmt = con.createStatement();

	        String sql = "INSERT INTO PART_CAR (SERIAL_NUMBER, PART_NAME, PART_PRICE) VALUES ("
	                + partCar.getSerialNumber() + ", '"
	                + partCar.getPartName() + "', "
	                + partCar.getPartPrice() + ")";

	        stmt.executeUpdate(sql);
	        System.out.println("Peça de carro inserida com sucesso!");

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	
	public static void insertSale(Sale sale) {
	    String url = "jdbc:postgresql://localhost:5432/DEALERSHIP_DATABASE";
	    String user = "postgres";
	    String password = "postgres";

	    try {
	        Connection con = DriverManager.getConnection(url, user, password);
	        Statement stmt = con.createStatement();

	        String sql = "INSERT INTO SALE (ID_SALE, SALE_DATE, CPF_CUSTOMER, CPF_SELLER) VALUES ("
	                + sale.getIdSale() + ", '"
	                + sale.getSaleDate() + "', "
	                + sale.getCPFcustomer() + ", "
	                + sale.getCPFseller() + ")";

	        stmt.executeUpdate(sql);
//	        System.out.println("Venda inserida com sucesso!");

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	public static void insertSeller(Seller seller) {
	    String url = "jdbc:postgresql://localhost:5432/DEALERSHIP_DATABASE";
	    String user = "postgres";
	    String password = "postgres";

	    try {
	        Connection con = DriverManager.getConnection(url, user, password);
	        Statement stmt = con.createStatement();

	        String sql = "INSERT INTO SELLER (CPF_SELLER, NAME_SELLER) VALUES ("
	                + seller.getCPFseller() + ", '"
	                + seller.getNameSeller() + "')";

	        stmt.executeUpdate(sql);
	        System.out.println("Vendedor inserido com sucesso!");

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	public static void insertService(Service service) {
	    String url = "jdbc:postgresql://localhost:5432/DEALERSHIP_DATABASE";
	    String user = "postgres";
	    String password = "postgres";

	    try {
	        Connection con = DriverManager.getConnection(url, user, password);
	        Statement stmt = con.createStatement();

	        String sql = "INSERT INTO SERVICE (ID_SERVICE, SERVICE_NAME, SERVICE_DATE, SERVICE_PRICE, CHASSI, CPF_CUSTOMER, CPF_MECHANIC) VALUES ("
	                + service.getIdService() + ", '"
	                + service.getServiceName() + "', '"
	                + service.getServiceDate() + "', "
	                + service.getServicePrice() + ", '"
	                + service.getChassi() + "', "
	                + service.getCPF_customer() + ", "
	                + service.getCPF_mechanic() + ")";

	        stmt.executeUpdate(sql);
	        System.out.println("Serviço inserido com sucesso!");

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	public static void insertTypeSale(TypeSale typeSale) {
	    String url = "jdbc:postgresql://localhost:5432/DEALERSHIP_DATABASE";
	    String user = "postgres";
	    String password = "postgres";

	    try {
	        Connection con = DriverManager.getConnection(url, user, password);
	        Statement stmt = con.createStatement();

	        String sql = "INSERT INTO TYPE_SALE (ID_TYPE_SALE, SALE_ITEM) VALUES ("
	                + typeSale.getIDTypeSale() + ", '"
	                + typeSale.getSaleItem() + "')";

	        stmt.executeUpdate(sql);
	        System.out.println("Tipo de venda inserido com sucesso!");

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}



}
