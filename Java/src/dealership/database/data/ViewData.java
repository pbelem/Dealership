package dealership.database.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ViewData {

    public static void customersPurchases() {
        String url = "jdbc:postgresql://localhost:5432/DEALERSHIP_DATABASE";
        String user = "postgres";
        String password = "postgres";

        try {
            Connection con = DriverManager.getConnection(url, user, password);

            Statement stmt = con.createStatement();

            String sql = "SELECT * FROM CustomerPurchases";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String customerName = rs.getString("CustomerName");
                String saleDate = rs.getString("SaleDate");

                System.out.println("Customer Name: " + customerName + ", Sale Date: " + saleDate);
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

