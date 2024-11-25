package dealership.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

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
}
