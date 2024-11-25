package dealership.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/DEALERSHIP_DATABASE";
        String user = "postgres";
        String password = "postgres";
        
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            // Inserir dados nas tabelas

            // Tabela TYPE_SALE
            stmt.executeUpdate("INSERT INTO TYPE_SALE (ID_TYPE_SALE, SALE_ITEM, ITEM_PRICE) VALUES (2, 'Car', 30000.00)");
            stmt.executeUpdate("INSERT INTO TYPE_SALE (ID_TYPE_SALE, SALE_ITEM, ITEM_PRICE) VALUES (3, 'Part', 150.00)");

            // Tabela SELLER
            stmt.executeUpdate("INSERT INTO SELLER (CPF_SELLER, NAME_SELLER) VALUES ('12345678900', 'John Doe')");

            // Tabela CUSTOMER
            stmt.executeUpdate("INSERT INTO CUSTOMER (CPF_CUSTOMER, NAME_CUSTOMER) VALUES ('09876543211', 'Jane Doe')");

            // Tabela ADDRESS
            stmt.executeUpdate("INSERT INTO ADDRESS (ID_ADDRESS, STATE, CITY, ZIP_CODE, STREET, NUMBER, COMPLEMENT) VALUES (1, 'Bahia', 'Salvador', '40000000', 'Rua Principal', 123, 'Apto 45')");

            // Tabela CAR
            stmt.executeUpdate("INSERT INTO CAR (CHASSI, CAR_MODEL, CAR_YEAR, CAR_COLOR, CAR_PRICE, ENGINE_BLOCK, LICENSE_PLATE) VALUES ('1HGBH41JXMN109186', 'Civic', 2022, 'Blue', 30000.00, 'V6', 'XYZ-1234')");

            // Tabela PART_CAR
            stmt.executeUpdate("INSERT INTO PART_CAR (SERIAL_NUMBER, PART_NAME, PART_PRICE, CAR_MODEL) VALUES ('SN123', 'Brake Pad', 75.00, 'Civic')");

            // Tabela SERVICE
            stmt.executeUpdate("INSERT INTO SERVICE (ID_SERVICE, SERVICE_NAME, SERVICE_DATE, SERVICE_PRICE, CHASSI, CPF_CUSTOMER, CPF_MECHANIC) VALUES (1, 'Oil Change', '2024-01-10', 100.00, '1HGBH41JXMN109186', '09876543211', '56789012345')");

            // Tabela MECHANIC
            stmt.executeUpdate("INSERT INTO MECHANIC (CPF_MECHANIC, NAME_MECHANIC) VALUES ('56789012345', 'Mike Mechanic')");

            // Tabela CUSTOMER_CARD
            stmt.executeUpdate("INSERT INTO CUSTOMER_CARD (CARD_NUMBER, CARD_OWNER, CARD_VALID, CVV, CPF_CUSTOMER) VALUES ('4111111111111111', 'Jane Doe', '2024-12-31', 123, '09876543211')");
            

            System.out.println("Dados inseridos com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
