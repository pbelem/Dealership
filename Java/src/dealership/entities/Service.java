package dealership.entities;

public class Service {

	Long IdService;
	String serviceName;
	String serviceDate;
	Double servicePrice;
	String chassi;
	Long CPF_customer;
	Long CPD_mechanic;
	
	public Service() {
	}

	public Service(Long idService, String serviceName, String serviceDate, Double servicePrice, String chassi,
			Long cPF_customer, Long cPD_mechanic) {
		super();
		IdService = idService;
		this.serviceName = serviceName;
		this.serviceDate = serviceDate;
		this.servicePrice = servicePrice;
		this.chassi = chassi;
		CPF_customer = cPF_customer;
		CPD_mechanic = cPD_mechanic;
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

	public Long getCPD_mechanic() {
		return CPD_mechanic;
	}

	public void setCPD_mechanic(Long cPD_mechanic) {
		CPD_mechanic = cPD_mechanic;
	}
	
	

}
