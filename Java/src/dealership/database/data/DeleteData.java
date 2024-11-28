package dealership.database.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteData {

    public static void deleteAddress(int idAddress) {
        executeDelete("DELETE FROM ADDRESS WHERE ID_ADDRESS = " + idAddress, "Endereço excluído com sucesso!");
    }

    public static void deleteCar(String chassi) {
        executeDelete("DELETE FROM CAR WHERE CHASSI = '" + chassi + "'", "Carro excluído com sucesso!");
    }

    public static void deleteCustomer(String cpfCustomer) {
        executeDelete("DELETE FROM CUSTOMER WHERE CPF_CUSTOMER = '" + cpfCustomer + "'", "Cliente excluído com sucesso!");
    }

    public static void deleteCustomerCard(String cardNumber) {
        executeDelete("DELETE FROM CUSTOMER_CARD WHERE CARD_NUMBER = '" + cardNumber + "'", "Cartão do cliente excluído com sucesso!");
    }

    public static void deleteMechanic(String cpfMechanic) {
        executeDelete("DELETE FROM MECHANIC WHERE CPF_MECHANIC = '" + cpfMechanic + "'", "Mecânico excluído com sucesso!");
    }

    public static void deletePartCar(int serialNumber) {
        executeDelete("DELETE FROM PART_CAR WHERE SERIAL_NUMBER = " + serialNumber, "Peça de carro excluída com sucesso!");
    }

    public static void deleteSale(int idSale) {
        executeDelete("DELETE FROM SALE WHERE ID_SALE = " + idSale, "Venda excluída com sucesso!");
    }

    public static void deleteSeller(String cpfSeller) {
        executeDelete("DELETE FROM SELLER WHERE CPF_SELLER = '" + cpfSeller + "'", "Vendedor excluído com sucesso!");
    }

    public static void deleteService(int idService) {
        executeDelete("DELETE FROM SERVICE WHERE ID_SERVICE = " + idService, "Serviço excluído com sucesso!");
    }

    public static void deleteTypeSale(int idTypeSale) {
        executeDelete("DELETE FROM TYPE_SALE WHERE ID_TYPE_SALE = " + idTypeSale, "Tipo de venda excluído com sucesso!");
    }

    private static void executeDelete(String sql, String successMessage) {
        String url = "jdbc:postgresql://localhost:5432/DEALERSHIP_DATABASE";
        String user = "postgres";
        String password = "postgres";

        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement()) {

            stmt.executeUpdate(sql);
            System.out.println(successMessage);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
}