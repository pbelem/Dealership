package dealership.entities;

public class TypeSale {
	
	Long typeSale;
	Long idSale;
	byte saleItem;
	Double itemPrice;
	
	public TypeSale() {
	}
	
	public TypeSale(Long typeSale, Long idSale, byte saleItem, Double itemPrice) {
		this.typeSale = typeSale;
		this.idSale = idSale;
		this.saleItem = saleItem;
		this.itemPrice = itemPrice;
	}

	public Long getTypeSale() {
		return typeSale;
	}

	public void setTypeSale(Long typeSale) {
		this.typeSale = typeSale;
	}

	public Long getIdSale() {
		return idSale;
	}

	public void setIdSale(Long idSale) {
		this.idSale = idSale;
	}

	public byte getSaleItem() {
		return saleItem;
	}

	public void setSaleItem(byte saleItem) {
		this.saleItem = saleItem;
	}

	public Double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	
	
	

}
