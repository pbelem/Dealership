package dealership.entities;

public class Mechanic {
	
	Long CPF_mechanic;
	String nameMechanic;
	
	public Mechanic() {
	}
	
	public Mechanic(Long CPF_mechanic, String nameMechanic) {
		this.CPF_mechanic = CPF_mechanic;
		this.nameMechanic = nameMechanic;
	}


	public Long getCPF_mechanic() {
		return CPF_mechanic;
	}


	public void setCPF_mechanic(Long cPF_mechanic) {
		CPF_mechanic = cPF_mechanic;
	}


	public String getNameMechanic() {
		return nameMechanic;
	}


	public void setNameMechanic(String nameMechanic) {
		this.nameMechanic = nameMechanic;
	}
	
	
	

}
