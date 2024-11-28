package dealership.database.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ViewData {

    public static void customersPurchases() {
        String url = "jdbc:postgresql://localhost:5432/DEALERSHIP_DATABASE";
        String user = "postgres";
        String password = "postgres";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            String sql = "SELECT * FROM detail_sale";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String customerName = rs.getString("name_customer");
                String saleDate = rs.getString("sale_date");
                String sellerName = rs.getString("name_seller");

                System.out.println("Customer Name: " + customerName + ", Sale Date: " + saleDate + ", Seller Name: " + sellerName);
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
