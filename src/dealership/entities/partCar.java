package dealership.entities;

public class partCar {
	
	Long serialNumber;
	String partName;
	Double partPrice;
	String carModel;
	
	public partCar() {
	}
	
	public partCar(Long serialNumber, String partName, Double partPrice, String carModel) {
		super();
		this.serialNumber = serialNumber;
		this.partName = partName;
		this.partPrice = partPrice;
		this.carModel = carModel;
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
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	
	

}
