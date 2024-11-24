package dealership.entities;

public class Adress {
	
	Long IdAdress;
	Long CPF_customer;
	String state;
	String city;
	int ZIP_code;
	String street;
	int number;
	String complement;
	
	public Adress() {
	}
	
	public Adress(Long idAdress, Long cPF_customer, String state, String city, int zIP_code, String street, int number,
			String complement) {
		super();
		IdAdress = idAdress;
		CPF_customer = cPF_customer;
		this.state = state;
		this.city = city;
		ZIP_code = zIP_code;
		this.street = street;
		this.number = number;
		this.complement = complement;
	}


	public Long getIdAdress() {
		return IdAdress;
	}


	public void setIdAdress(Long idAdress) {
		IdAdress = idAdress;
	}


	public Long getCPF_customer() {
		return CPF_customer;
	}


	public void setCPF_customer(Long cPF_customer) {
		CPF_customer = cPF_customer;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getZIP_code() {
		return ZIP_code;
	}


	public void setZIP_code(int zIP_code) {
		ZIP_code = zIP_code;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public String getComplement() {
		return complement;
	}


	public void setComplement(String complement) {
		this.complement = complement;
	}
	
	

}
