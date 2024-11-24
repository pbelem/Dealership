package dealership.entities;

public class Car {
	
	String chassi;
	String carModel;
	short carYear;
	String carCollor;
	Double carPrice;
	String blockEngine;
	
	public Car() {
	}
	
	public Car(String chassi, String carModel, short carYear, String carCollor, Double carPrice, String blockEngine) {

		this.chassi = chassi;
		this.carModel = carModel;
		this.carYear = carYear;
		this.carCollor = carCollor;
		this.carPrice = carPrice;
		this.blockEngine = blockEngine;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public short getCarYear() {
		return carYear;
	}

	public void setCarYear(short carYear) {
		this.carYear = carYear;
	}

	public String getCarCollor() {
		return carCollor;
	}

	public void setCarCollor(String carCollor) {
		this.carCollor = carCollor;
	}

	public Double getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(Double carPrice) {
		this.carPrice = carPrice;
	}

	public String getBlockEngine() {
		return blockEngine;
	}

	public void setBlockEngine(String blockEngine) {
		this.blockEngine = blockEngine;
	}
	
	
	
	

}
