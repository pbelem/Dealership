package dealership.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {

	public static void main(String[] args) {
		
     		String driver = "org.postgresql.Driver";
	        String user   = "postgres";
	        String senha = "postgres";
			String url      = "jdbc:postgresql://localhost:5432/empresa";

	      try {
	        Class.forName(driver);
            Connection con = null;
            con = (Connection) DriverManager.getConnection(url, user, senha);
    		System.out.println("Conex�o realizada com sucesso.");

			}catch(Exception e)
			{
				 System.err.print(e.getMessage());

			}
		/*ConectaPostgres banco = new ConectaPostgres();
		String driver = "org.postgresql.Driver";
        String user   = "postgres";
        String password = "postgres";
        String url      = "jdbc:postgresql://localhost:5432/empresa";
        banco.Conectar(url, user, password);*/
       			
	}

}
