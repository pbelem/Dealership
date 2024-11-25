package dealership.entities;

import dealership.util.IDGenerator;

public class Sale {

	Long idSale;
	String saleDate;
	Long CPFcustomer;
	Long CPFseller;

	public Sale() {
	}

	public Sale(String saleDate, Customer customer, Seller seller) {
		this.idSale = IDGenerator.getInstance().getNextId();
		this.saleDate = saleDate;
		this.CPFcustomer = customer.CPF_customer;
		this.CPFseller = seller.CPFseller;
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

	public Long getCPFcustomer() {
		return CPFcustomer;
	}

	public void setCPFcustomer(Long CPFcustomer) {
		this.CPFcustomer = CPFcustomer;
	}

	public Long getCPFseller() {
		return CPFseller;
	}

	public void setCPFseller(Long CPFseller) {
		this.CPFseller = CPFseller;
	}

}
