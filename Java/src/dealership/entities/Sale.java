package dealership.entities;

public class Sale {
	
	Long idSale;
	String saleDate;
	int CPFcustomer;
	int CPFseller;
	
	public Sale() {
		
	}
	
	public Sale(int idSale, String saleDate, int cPFcustomer, int cPFseller) {
		super();
		this.idSale = (long) idSale;
		this.saleDate = saleDate;
		CPFcustomer = cPFcustomer;
		CPFseller = cPFseller;
	}

	public Long getIdSale() {
		return idSale;
	}

	public void setIdSale(int idSale) {
		this.idSale = (long) idSale;
	}

	public String getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(String saleDate) {
		this.saleDate = saleDate;
	}

	public int getCPFcustomer() {
		return CPFcustomer;
	}

	public void setCPFcustomer(int cPFcustomer) {
		CPFcustomer = cPFcustomer;
	}

	public int getCPFseller() {
		return CPFseller;
	}

	public void setCPFseller(int cPFseller) {
		CPFseller = cPFseller;
	}
	

}
