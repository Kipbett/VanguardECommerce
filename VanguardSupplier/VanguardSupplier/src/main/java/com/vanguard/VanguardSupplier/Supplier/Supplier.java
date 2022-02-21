package com.vanguard.VanguardSupplier.Supplier;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "supplier")
public class Supplier {
	
	@Id
	private String id;
	
	@Field("supplier_name")
	private String supplier_name;
	
	@Field("supplier_address")
	private String supplier_address;
	
	@Field("supplier_email")
	private String supplier_email;
	
	public Supplier(String id, String supplier_name, String supplier_address, String supplier_email) {
		super();
		this.id = id;
		this.supplier_name = supplier_name;
		this.supplier_address = supplier_address;
		this.supplier_email = supplier_email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSupplier_name() {
		return supplier_name;
	}
	public void setSupplier_name(String supplier_name) {
		this.supplier_name = supplier_name;
	}
	public String getSupplier_address() {
		return supplier_address;
	}
	public void setSupplier_address(String supplier_address) {
		this.supplier_address = supplier_address;
	}
	public String getSupplier_email() {
		return supplier_email;
	}
	public void setSupplier_email(String supplier_email) {
		this.supplier_email = supplier_email;
	}
	@Override
	public String toString() {
		return "Supplier [id=" + id + ", supplier_name=" + supplier_name + ", supplier_address=" + supplier_address
				+ ", supplier_email=" + supplier_email + "]";
	}
	
	
}
