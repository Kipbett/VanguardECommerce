package com.vanguardECommerce.VanguardItem.Item;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "item")
public class Item {
	
	@Id
	int barcode;
	@Field("itemName")
	String itemName;
	@Field("itemDescription")
	String itemDescription;
	@Field("supplierID")
	String supplierId;
	@Field("stock")
	int stock;
	@Field("buyPrice")
	double buyPrice;
	@Field("sellPrice")
	double sellPrice;
	public Item(int barcode, String itemName, String itemDescription, String supplierId, int stock, double buyPrice,
			double sellPrice) {
		super();
		this.barcode = barcode;
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.supplierId = supplierId;
		this.stock = stock;
		this.buyPrice = buyPrice;
		this.sellPrice = sellPrice;
	}
	public int getBarcode() {
		return barcode;
	}
	public void setBarcode(int barcode) {
		this.barcode = barcode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public String getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public double getBuyPrice() {
		return buyPrice;
	}
	public void setBuyPrice(double buyPrice) {
		this.buyPrice = buyPrice;
	}
	public double getSellPrice() {
		return sellPrice;
	}
	public void setSellPrice(double sellPrice) {
		this.sellPrice = sellPrice;
	}
	@Override
	public String toString() {
		return "Item [barcode=" + barcode + ", itemName=" + itemName + ", itemDescription=" + itemDescription
				+ ", supplierId=" + supplierId + ", stock=" + stock + ", buyPrice=" + buyPrice + ", sellPrice="
				+ sellPrice + "]";
	}
	
	
	

}
