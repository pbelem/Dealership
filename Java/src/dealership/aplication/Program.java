package dealership.aplication;

import dealership.database.ConectaPostgres;
import dealership.database.testeConexaoBD;

public class Program {

	public static void main(String[] args) {

 		@SuppressWarnings("unused")
		String driver = "org.postgresql.Driver";
        String user   = "postgres";
        String password = "postgres";
		String url      = "jdbc:postgresql://localhost:5432/DEALERSHIP_DATABASE";
		
		ConectaPostgres banco = new ConectaPostgres();
        banco.Conectar(url, user, password);
        testeConexaoBD.teste();
        
        
		
		
	}
}