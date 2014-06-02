package com.samplemart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "stores")
public class Store implements java.io.Serializable {
 
	private int storeId;
	private String storeName;
	private String storeAddress;
	private String storePhone;
 
	public Store() {
	}
 
	public Store(int storeId, String storeName, String storeAddress,
			String storePhone) {
		this.storeId = storeId;
		this.storeName = storeName;
		this.storeAddress = storeAddress;
		this.storePhone = storePhone;
	}
 
	@Id
	@Column(name = "sto_id", unique = true, nullable = false, precision = 5, scale = 0)
	public int getId() {
		return this.storeId;
	}
 
	public void setId(int id) {
		this.storeId = id;
	}
 
	@Column(name = "sto_name", nullable = false, length = 150)
	public String getName() {
		return this.storeName;
	}
 
	public void setName(String name) {
		this.storeName = name;
	}
 
	@Column(name = "sto_address", nullable = false, length = 255)
	public String getAddress() {
		return this.storeAddress;
	}
 
	public void setAddress(String address) {
		this.storeAddress = address;
	}
	
	@Column(name = "sto_phone", nullable = false, length = 30)
	public String getPhone() {
		return this.storePhone;
	}
 
	public void setPhone(String phone) {
		this.storePhone = phone;
	}
 
}