package dealership.database.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectData {

    private static final String URL = "jdbc:postgresql://localhost:5432/dealership_database";
    private static final String USER = "postgres";
    private static final String PASSWORD = "postgres";

    public static void selectSeller(String cpfSeller) {
        String query = "SELECT * FROM SELLER WHERE CPF_SELLER = ?";
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = con.prepareStatement(query)) {

            pstmt.setString(1, cpfSeller);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    System.out.println("Vendedor encontrado:");
                    System.out.println("CPF: " + rs.getString("CPF_SELLER"));
                    System.out.println("Nome: " + rs.getString("NAME_SELLER"));
                } else {
                    System.out.println("Vendedor não encontrado.");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectAllSellers() {
        String query = "SELECT * FROM SELLER";
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = con.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {

            System.out.println("Lista de vendedores:");
            while (rs.next()) {
                System.out.println("CPF: " + rs.getString("CPF_SELLER") + " | Nome: " + rs.getString("NAME_SELLER"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectCustomer(String cpfCustomer) {
        String query = "SELECT * FROM CUSTOMER WHERE CPF_CUSTOMER = ?";
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = con.prepareStatement(query)) {

            pstmt.setString(1, cpfCustomer);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    System.out.println("Cliente encontrado:");
                    System.out.println("CPF: " + rs.getString("CPF_CUSTOMER"));
                    System.out.println("Nome: " + rs.getString("NAME_CUSTOMER"));
                } else {
                    System.out.println("Cliente não encontrado.");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectAllCustomers() {
        String query = "SELECT * FROM CUSTOMER";
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = con.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {

            System.out.println("Lista de clientes:");
            while (rs.next()) {
                System.out.println("CPF: " + rs.getString("CPF_CUSTOMER") + " | Nome: " + rs.getString("NAME_CUSTOMER"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectCar(String chassi) {
        String query = "SELECT * FROM CAR WHERE CHASSI = ?";
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = con.prepareStatement(query)) {

            pstmt.setString(1, chassi);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    System.out.println("Carro encontrado:");
                    System.out.println("Chassi: " + rs.getString("CHASSI"));
                    System.out.println("Modelo: " + rs.getString("MODEL"));
                    System.out.println("Ano: " + rs.getInt("YEAR"));
                } else {
                    System.out.println("Carro não encontrado.");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectAllCars() {
        String query = "SELECT * FROM CAR";
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = con.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {

            System.out.println("Lista de carros:");
            while (rs.next()) {
                System.out.println("Chassi: " + rs.getString("CHASSI") + " | Modelo: " + rs.getString("MODEL"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectService(int idService) {
        String query = "SELECT * FROM SERVICE WHERE ID_SERVICE = ?";
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = con.prepareStatement(query)) {

            pstmt.setInt(1, idService);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    System.out.println("Serviço encontrado:");
                    System.out.println("ID Serviço: " + rs.getInt("ID_SERVICE"));
                    System.out.println("Nome: " + rs.getString("NAME_SERVICE"));
                    System.out.println("Preço: " + rs.getDouble("PRICE"));
                } else {
                    System.out.println("Serviço não encontrado.");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectAllServices() {
        String query = "SELECT * FROM SERVICE";
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = con.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {

            System.out.println("Lista de serviços:");
            while (rs.next()) {
                System.out.println("ID Serviço: " + rs.getInt("ID_SERVICE") + " | Nome: " + rs.getString("NAME_SERVICE"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectPartCar(int serialNumber) {
        String query = "SELECT * FROM PART_CAR WHERE SERIAL_NUMBER = ?";
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = con.prepareStatement(query)) {

            pstmt.setInt(1, serialNumber);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    System.out.println("Peça de carro encontrada:");
                    System.out.println("Número de Série: " + rs.getInt("SERIAL_NUMBER"));
                    System.out.println("Nome: " + rs.getString("PART_NAME"));
                    System.out.println("Preço: " + rs.getDouble("PART_PRICE"));
                } else {
                    System.out.println("Peça de carro não encontrada.");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectAllPartCars() {
        String query = "SELECT * FROM PART_CAR";
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = con.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {

            System.out.println("Lista de peças de carro:");
            while (rs.next()) {
                System.out.println("Número de Série: " + rs.getInt("SERIAL_NUMBER") + " | Nome: " + rs.getString("PART_NAME"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectSale(int idSale) {
        String query = "SELECT * FROM SALE WHERE ID_SALE = ?";
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = con.prepareStatement(query)) {

            pstmt.setInt(1, idSale);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    System.out.println("Venda encontrada:");
                    System.out.println("ID Venda: " + rs.getInt("ID_SALE"));
                    System.out.println("Data: " + rs.getString("SALE_DATE"));
                } else {
                    System.out.println("Venda não encontrada.");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectAllSales() {
        String query = "SELECT * FROM SALE";
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = con.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {

            System.out.println("Lista de vendas:");
            while (rs.next()) {
                System.out.println("ID Venda: " + rs.getInt("ID_SALE") + " | Data: " + rs.getString("SALE_DATE"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}