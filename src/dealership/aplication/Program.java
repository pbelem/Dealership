package dealership.aplication;

import dealership.database.DatabaseOperations;

public class Program {

    public static void main(String[] args) {
        // Insira um novo cliente
        DatabaseOperations.insertCustomer(1, "João Silva", "Rua 1", "Cidade 1", "Estado 1", "12345-678", "1234567890123456", "12/25", "123", "senha123");

        // Selecione todos os clientes
        DatabaseOperations.selectCustomers();
    }

}
