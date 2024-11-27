package dealership.aplication;

import dealership.database.connection.ConectaPostgres;
import dealership.database.connection.testeConexaoBD;
import dealership.util.ChooseOperation;


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
        
        ChooseOperation.chooseOperation();
	}
}