package dealership.entities;

public class Customer {
	
	Long CPF_customer;
	String NameCustomer;
	
	public Customer() {
	}
	
	
	public Customer(Long CPF_customer, String nameCustomer) {
		super();
		this.CPF_customer = CPF_customer;
		NameCustomer = nameCustomer;
	}


	public Long getCPF_customer() {
		return CPF_customer;
	}


	public void setCPF_customer(Long cPF_customer) {
		CPF_customer = cPF_customer;
	}


	public String getNameCustomer() {
		return NameCustomer;
	}


	public void setNameCustomer(String nameCustomer) {
		NameCustomer = nameCustomer;
	}
	
	
	
	

}
