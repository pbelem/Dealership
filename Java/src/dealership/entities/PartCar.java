package dealership.entities;

public class PartCar {
	
	Long serialNumber;
	String partName;
	Double partPrice;
	
	public PartCar() {
	}
	
	public PartCar(Long serialNumber, String partName, Double partPrice) {
		this.serialNumber = serialNumber;
		this.partName = partName;
		this.partPrice = partPrice;

	}
	public Long getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(Long serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getPartName() {
		return partName;
	}
	public void setPartName(String partName) {
		this.partName = partName;
	}
	public Double getPartPrice() {
		return partPrice;
	}
	public void setPartPrice(Double partPrice) {
		this.partPrice = partPrice;
	}
	
	
}
