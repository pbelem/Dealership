package dealership.entities;

import dealership.util.IDGenerator;

public class TypeSale {

	Long IDtypeSale;
	Long idSale;
	byte saleItem;
	Double itemPrice;

	public TypeSale() {
	}

	public TypeSale(Sale sale, byte saleItem) {
		this.IDtypeSale = IDGenerator.getInstance().getNextId();
		this.idSale = sale.idSale;
		this.saleItem = saleItem;

	}

	public TypeSale(Long typeId, byte itemSale) {
		// TODO Auto-generated constructor stub
		typeId = IDtypeSale;
		itemSale = saleItem;
	}

	public Long getIDTypeSale() {
		return IDtypeSale;
	}

	public void setIDTypeSale(Long IDtypeSale) {
		this.IDtypeSale = IDtypeSale;
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
}
