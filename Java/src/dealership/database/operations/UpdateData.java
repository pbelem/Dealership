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

public class UpdateData {
    public static void main(String[] args) {
        // Você pode testar seus métodos de update aqui
    }

    public static void updateAddress(Address address) {
        String url = "jdbc:postgresql://localhost:5432/DEALERSHIP_DATABASE";
        String user = "postgres";
        String password = "postgres";
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            String sql = "UPDATE ADDRESS SET STATE = '" + address.getState() + "', "
                    + "CITY = '" + address.getCity() + "', "
                    + "ZIP_CODE = " + address.getZIP_code() + ", "
                    + "STREET = '" + address.getStreet() + "', "
                    + "NUMBER = " + address.getNumber() + ", "
                    + "COMPLEMENT = '" + address.getComplement() + "' "
                    + "WHERE ID_ADDRESS = " + address.getIdAdress();
            stmt.executeUpdate(sql);
            System.out.println("Endereço atualizado com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateCar(Car car, TypeSale typesale) {
        String url = "jdbc:postgresql://localhost:5432/DEALERSHIP_DATABASE";
        String user = "postgres";
        String password = "postgres";
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            String sql;
            if (typesale.getSaleItem() == 1) {
                sql = "UPDATE CAR SET CAR_MODEL = '" + car.getCarModel() + "', "
                        + "CAR_YEAR = " + car.getCarYear() + ", "
                        + "CAR_COLOR = '" + car.getCarCollor() + "', "
                        + "CAR_PRICE = " + car.getCarPrice() + " "
                        + "WHERE CHASSI = '" + car.getChassi() + "'";
            } else {
                sql = "UPDATE CAR SET CAR_MODEL = '" + car.getCarModel() + "', "
                        + "CAR_YEAR = " + car.getCarYear() + ", "
                        + "CAR_COLOR = '" + car.getCarCollor() + "' "
                        + "WHERE CHASSI = '" + car.getChassi() + "'";
            }
            stmt.executeUpdate(sql);
            System.out.println("Carro atualizado com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateCustomer(Customer customer) {
        String url = "jdbc:postgresql://localhost:5432/DEALERSHIP_DATABASE";
        String user = "postgres";
        String password = "postgres";
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            String sql = "UPDATE CUSTOMER SET NAME_CUSTOMER = '" + customer.getNameCustomer() + "' "
                    + "WHERE CPF_CUSTOMER = " + customer.getCPF_customer();
            stmt.executeUpdate(sql);
            System.out.println("Cliente atualizado com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateCustomerCard(CustomerCard customerCard) {
        String url = "jdbc:postgresql://localhost:5432/DEALERSHIP_DATABASE";
        String user = "postgres";
        String password = "postgres";
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            String sql = "UPDATE CUSTOMER_CARD SET CARD_OWNER = '" + customerCard.getCardOwner() + "', "
                    + "CARD_VALID = '" + customerCard.getCardValid() + "', "
                    + "CVV = " + customerCard.getCVV() + " "
                    + "WHERE CARD_NUMBER = " + customerCard.getCardNumber() + " "
                    + "AND CPF_CUSTOMER = " + customerCard.getCPF_customer();
            stmt.executeUpdate(sql);
            System.out.println("Cartão do cliente atualizado com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateMechanic(Mechanic mechanic) {
        String url = "jdbc:postgresql://localhost:5432/DEALERSHIP_DATABASE";
        String user = "postgres";
        String password = "postgres";
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            String sql = "UPDATE MECHANIC SET NAME_MECHANIC = '" + mechanic.getNameMechanic() + "' "
                    + "WHERE CPF_MECHANIC = " + mechanic.getCPF_mechanic();
            stmt.executeUpdate(sql);
            System.out.println("Mecânico atualizado com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updatePartCar(PartCar partCar) {
        String url = "jdbc:postgresql://localhost:5432/DEALERSHIP_DATABASE";
        String user = "postgres";
        String password = "postgres";
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            String sql = "UPDATE PART_CAR SET PART_NAME = '" + partCar.getPartName() + "', "
                    + "PART_PRICE = " + partCar.getPartPrice() + " "
                    + "WHERE SERIAL_NUMBER = " + partCar.getSerialNumber();
            stmt.executeUpdate(sql);
            System.out.println("Peça de carro atualizada com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateSale(Sale sale) {
        String url = "jdbc:postgresql://localhost:5432/DEALERSHIP_DATABASE";
        String user = "postgres";
        String password = "postgres";
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            String sql = "UPDATE SALE SET SALE_DATE = '" + sale.getSaleDate() + "', "
                    + "CPF_CUSTOMER = " + sale.getCPFcustomer() + ", "
                    + "CPF_SELLER = " + sale.getCPFseller() + " "
                    + "WHERE ID_SALE = " + sale.getIdSale();
            stmt.executeUpdate(sql);
            System.out.println("Venda atualizada com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateSeller(Seller seller) {
        String url = "jdbc:postgresql://localhost:5432/DEALERSHIP_DATABASE";
        String user = "postgres";
        String password = "postgres";
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            String sql = "UPDATE SELLER SET NAME_SELLER = '" + seller.getNameSeller() + "' "
                    + "WHERE CPF_SELLER = " + seller.getCPFseller();
            stmt.executeUpdate(sql);
            System.out.println("Vendedor atualizado com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateService(Service service) {
        String url = "jdbc:postgresql://localhost:5432/DEALERSHIP_DATABASE";
        String user = "postgres";
        String password = "postgres";
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            String sql = "UPDATE SERVICE SET SERVICE_NAME = '" + service.getServiceName() + "', "
                    + "SERVICE_DATE = '" + service.getServiceDate() + "', "
                    + "SERVICE_PRICE = " + service.getServicePrice() + ", "
                    + "CHASSI = '" + service.getChassi() + "', "
                    + "CPF_CUSTOMER = " + service.getCPF_customer() + ", "
                    + "CPF_MECHANIC = " + service.getCPF_mechanic() + " "
                    + "WHERE ID_SERVICE = " + service.getIdService();
            stmt.executeUpdate(sql);
            System.out.println("Serviço atualizado com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateTypeSale(TypeSale typeSale) {
        String url = "jdbc:postgresql://localhost:5432/DEALERSHIP_DATABASE";
        String user = "postgres";
        String password = "postgres";
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            String sql = "UPDATE TYPE_SALE SET SALE_ITEM = '" + typeSale.getSaleItem() + "' "
                    + "WHERE ID_TYPE_SALE = " + typeSale.getIDTypeSale();
            stmt.executeUpdate(sql);
            System.out.println("Tipo de venda atualizado com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

