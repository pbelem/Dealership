package dealership.entities;

public class Seller {
	
	Long CPFseller;
	String nameSeller;
	
	public Seller() {
	}
	
	public Seller(Long CPFseller, String nameSeller) {
		this.CPFseller = (long) CPFseller;
		this.nameSeller = nameSeller;
	}

	public Long getCPFseller() {
		return CPFseller;
	}

	public void setCPFseller(int CPFseller) {
		this.CPFseller = (long) CPFseller;
	}

	public String getNameSeller() {
		return nameSeller;
	}

	public void setNameSeller(String nameSeller) {
		this.nameSeller = nameSeller;
	}
	
	
	
	

}
