package dealership.entities;

public class CustomerCard {
	
	Long CardNumber;
	String CardOwner;
	String CardValid;
	short CVV;
	Long CPF_customer;
	
	
	public CustomerCard(Long cardNumber, String cardOwner, String cardValid, short cVV, Long cPF_customer) {
		super();
		CardNumber = cardNumber;
		CardOwner = cardOwner;
		CardValid = cardValid;
		CVV = cVV;
		CPF_customer = cPF_customer;
	}


	public Long getCardNumber() {
		return CardNumber;
	}


	public void setCardNumber(Long cardNumber) {
		CardNumber = cardNumber;
	}


	public String getCardOwner() {
		return CardOwner;
	}


	public void setCardOwner(String cardOwner) {
		CardOwner = cardOwner;
	}


	public String getCardValid() {
		return CardValid;
	}


	public void setCardValid(String cardValid) {
		CardValid = cardValid;
	}


	public short getCVV() {
		return CVV;
	}


	public void setCVV(short cVV) {
		CVV = cVV;
	}


	public Long getCPF_customer() {
		return CPF_customer;
	}


	public void setCPF_customer(Long cPF_customer) {
		CPF_customer = cPF_customer;
	}
	
	
	

}
