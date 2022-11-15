package com.inventory.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="inventories")
public class Inventory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="Item_Name",length=45,nullable=false)
	private String itemName;
	@Column(name="Quantity",length= 45,nullable=false)
	private long Quantity;
	public Inventory() {
		super();
	}
	public Inventory(long id, String itemName, long quantity) {
		this.id = id;
		this.itemName = itemName;
		Quantity = quantity;
	}

	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public long getQuantity() {
		return Quantity;
	}
	public void setQuantity(long quantity) {
		Quantity = quantity;
	}
	 
	
	
	
	
}
