package dealership.database.data;

import java.sql.*;

public class SelectData {
    
    private static String url = "jdbc:postgresql://localhost:5432/DEALERSHIP_DATABASE";
    private static String user = "postgres";
    private static String password = "postgres";
    
    public static void selectSeller(long cpfSeller) {
        String sql = "SELECT * FROM SELLER WHERE CPF_SELLER = " + cpfSeller;
        
        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement()) {

            ResultSet rs = stmt.executeQuery(sql);
            
            if (rs.next()) {
                System.out.println("Nome do Vendedor: " + rs.getString("NAME_SELLER"));
            } else {
                System.out.println("Vendedor não encontrado.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectAllSellers() {
        String sql = "SELECT * FROM SELLER";
        
        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement()) {

            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                System.out.println("CPF do Vendedor: " + rs.getString("CPF_SELLER"));
                System.out.println("Nome do Vendedor: " + rs.getString("NAME_SELLER"));
                System.out.println("----------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectSale(int idSale) {
        String sql = "SELECT s.*, sel.NAME_SELLER FROM SALE s " +
                     "JOIN SELLER sel ON s.CPF_SELLER = sel.CPF_SELLER " +
                     "WHERE s.ID_SALE = " + idSale;
        
        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement()) {

            ResultSet rs = stmt.executeQuery(sql);
            
            if (rs.next()) {
                System.out.println("ID da Venda: " + rs.getInt("ID_SALE"));
                System.out.println("Data da Venda: " + rs.getDate("SALE_DATE"));
                System.out.println("Vendedor: " + rs.getString("NAME_SELLER"));
            } else {
                System.out.println("Venda não encontrada.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectAllSales() {
        String sql = "SELECT s.*, sel.NAME_SELLER FROM SALE s " +
                     "JOIN SELLER sel ON s.CPF_SELLER = sel.CPF_SELLER";
        
        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement()) {

            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                System.out.println("ID da Venda: " + rs.getInt("ID_SALE"));
                System.out.println("Data da Venda: " + rs.getDate("SALE_DATE"));
                System.out.println("Vendedor: " + rs.getString("NAME_SELLER"));
                System.out.println("----------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectPartCar(int serialNumber) {
        String sql = "SELECT * FROM PART_CAR WHERE SERIAL_NUMBER = " + serialNumber;
        
        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement()) {

            ResultSet rs = stmt.executeQuery(sql);
            
            if (rs.next()) {
                System.out.println("Número de Série: " + rs.getInt("SERIAL_NUMBER"));
                System.out.println("Nome da Peça: " + rs.getString("PART_NAME"));
                System.out.println("Preço da Peça: " + rs.getDouble("PART_PRICE"));
            } else {
                System.out.println("Peça não encontrada.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectAllPartCars() {
        String sql = "SELECT * FROM PART_CAR";
        
        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement()) {

            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                System.out.println("Número de Série: " + rs.getInt("SERIAL_NUMBER"));
                System.out.println("Nome da Peça: " + rs.getString("PART_NAME"));
                System.out.println("Preço da Peça: " + rs.getDouble("PART_PRICE"));
                System.out.println("----------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectMechanic(int cpfMechanic) {
        String sql = "SELECT * FROM MECHANIC WHERE CPF_MECHANIC = " + cpfMechanic;
        
        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement()) {

            ResultSet rs = stmt.executeQuery(sql);
            
            if (rs.next()) {
                System.out.println("Nome do Mecânico: " + rs.getString("NAME_MECHANIC"));
            } else {
                System.out.println("Mecânico não encontrado.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectAllMechanics() {
        String sql = "SELECT * FROM MECHANIC";
        
        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement()) {

            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                System.out.println("CPF do Mecânico: " + rs.getString("CPF_MECHANIC"));
                System.out.println("Nome do Mecânico: " + rs.getString("NAME_MECHANIC"));
                System.out.println("----------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectService(int idService) {
        String sql = "SELECT * FROM SERVICE WHERE ID_SERVICE = " + idService;
        
        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement()) {

            ResultSet rs = stmt.executeQuery(sql);
            
            if (rs.next()) {
                System.out.println("ID do Serviço: " + rs.getInt("ID_SERVICE"));
                System.out.println("Nome do Serviço: " + rs.getString("SERVICE_NAME"));
                System.out.println("Data do Serviço: " + rs.getDate("SERVICE_DATE"));
                System.out.println("Preço do Serviço: " + rs.getDouble("SERVICE_PRICE"));
            } else {
                System.out.println("Serviço não encontrado.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectAllServices() {
        String sql = "SELECT * FROM SERVICE";
        
        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement()) {

            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                System.out.println("ID do Serviço: " + rs.getInt("ID_SERVICE"));
                System.out.println("Nome do Serviço: " + rs.getString("SERVICE_NAME"));
                System.out.println("Data do Serviço: " + rs.getDate("SERVICE_DATE"));
                System.out.println("Preço do Serviço: " + rs.getDouble("SERVICE_PRICE"));
                System.out.println("----------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectCar(String chassi) {
        String sql = "SELECT * FROM CAR WHERE CHASSI = '" + chassi + "'";
        
        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement()) {

            ResultSet rs = stmt.executeQuery(sql);
            
            if (rs.next()) {
                System.out.println("Chassi: " + rs.getString("CHASSI"));
                System.out.println("Modelo do Carro: " + rs.getString("CAR_MODEL"));
                System.out.println("Ano do Carro: " + rs.getInt("CAR_YEAR"));
                System.out.println("Cor do Carro: " + rs.getString("CAR_COLOR"));
                System.out.println("Preço do Carro: " + rs.getDouble("CAR_PRICE"));
            } else {
                System.out.println("Carro não encontrado.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectAllCars() {
        String sql = "SELECT * FROM CAR";
        
        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement()) {

            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                System.out.println("Chassi: " + rs.getString("CHASSI"));
                System.out.println("Modelo do Carro: " + rs.getString("CAR_MODEL"));
                System.out.println("Ano do Carro: " + rs.getInt("CAR_YEAR"));
                System.out.println("Cor do Carro: " + rs.getString("CAR_COLOR"));
                System.out.println("Preço do Carro: " + rs.getDouble("CAR_PRICE"));
                System.out.println("----------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectCustomer(long cpfCustomer) {
        String sql = "SELECT * FROM CUSTOMER WHERE CPF_CUSTOMER = " + cpfCustomer;
        
        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement()) {

            ResultSet rs = stmt.executeQuery(sql);
            
            if (rs.next()) {
                System.out.println("Nome do Cliente: " + rs.getString("NAME_CUSTOMER"));
                System.out.println("CPF do Cliente: " + rs.getString("CPF_CUSTOMER"));
                System.out.println("Endereço: " + rs.getString("ADDRESS"));
                System.out.println("Telefone: " + rs.getString("PHONE"));
            } else {
                System.out.println("Cliente não encontrado.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectAllCustomers() {
        String sql = "SELECT * FROM CUSTOMER";
        
        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement()) {

            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                System.out.println("Nome do Cliente: " + rs.getString("NAME_CUSTOMER"));
                System.out.println("CPF do Cliente: " + rs.getString("CPF_CUSTOMER"));
                System.out.println("Endereço: " + rs.getString("ADDRESS"));
                System.out.println("Telefone: " + rs.getString("PHONE"));
                System.out.println("----------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
