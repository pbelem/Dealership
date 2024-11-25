package dealership.entities;

import dealership.util.IDGenerator;

public class Service {

	Long IdService;
	String serviceName;
	String serviceDate;
	Double servicePrice;
	String chassi;
	Long CPF_customer;
	Long CPF_mechanic;

	public Service() {
	}

	public Service(String serviceName, String serviceDate, Double servicePrice, Car car, Customer customer,
			Mechanic mechanic) {
		IdService = IDGenerator.getInstance().getNextId();
		this.serviceName = serviceName;
		this.serviceDate = serviceDate;
		this.servicePrice = servicePrice;
		chassi = car.chassi;
		CPF_customer = customer.CPF_customer;
		CPF_mechanic = mechanic.CPF_mechanic;

	}

	public Long getIdService() {
		return IdService;
	}

	public void setIdService(Long idService) {
		IdService = idService;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceDate() {
		return serviceDate;
	}

	public void setServiceDate(String serviceDate) {
		this.serviceDate = serviceDate;
	}

	public Double getServicePrice() {
		return servicePrice;
	}

	public void setServicePrice(Double servicePrice) {
		this.servicePrice = servicePrice;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public Long getCPF_customer() {
		return CPF_customer;
	}

	public void setCPF_customer(Long cPF_customer) {
		CPF_customer = cPF_customer;
	}

	public Long getCPF_mechanic() {
		return CPF_mechanic;
	}

	public void setCPD_mechanic(Long CPD_mechanic) {
		this.CPF_mechanic = CPD_mechanic;
	}

}
