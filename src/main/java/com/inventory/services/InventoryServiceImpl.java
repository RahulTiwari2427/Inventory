package com.inventory.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.Repository.InventoryRepository;
import com.inventory.entities.Inventory;

@Service
public class InventoryServiceImpl implements InventoryService {
	
	@Autowired
	private InventoryRepository inventory;
	

	@Override
	public List<Inventory> getInventories() {
		return inventory.findAll();
	}



	@Override
	public Inventory addInventory(Inventory inv) {
		 inventory.save(inv);
		return inv;
	}



	@Override
	public Inventory updateInventory(Inventory inv) {
		inventory.save(inv);
		return inv;
	}



	@Override
	public void deleteById(Long id) {
		 
		inventory.deleteById(id);;
	}

}
