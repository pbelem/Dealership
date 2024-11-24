package dealership.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseOperations {

    public static void insertCustomer(int customerId, String customerName, String street, String city, String state, String zipCode, String cardNumber, String cardValid, String cardCVV, String cardPassword) {
        String sql = "INSERT INTO Customer (customerId, customerName, address[street, city, state, zipCode], customerCard[cardNumber, cardValid, cardCVV, cardPassword]) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection connection = DatabaseConnection.Conectar();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, customerId);
            pstmt.setString(2, customerName);
            pstmt.setString(3, street);
            pstmt.setString(4, city);
            pstmt.setString(5, state);
            pstmt.setString(6, zipCode);
            pstmt.setString(7, cardNumber);
            pstmt.setString(8, cardValid);
            pstmt.setString(9, cardCVV);
            pstmt.setString(10, cardPassword);
            pstmt.executeUpdate();
            System.out.println("Cliente inserido com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir cliente.");
            e.printStackTrace();
        }
    }

    public static void selectCustomers() {
        String sql = "SELECT * FROM Customer";
        try (Connection connection = DatabaseConnection.connect();
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("customerId") + ", Name: " + rs.getString("customerName"));
                // Continue para outros atributos conforme necessário
            }
        } catch (SQLException e) {
            System.out.println("Erro ao selecionar clientes.");
            e.printStackTrace();
        }
    }


}
