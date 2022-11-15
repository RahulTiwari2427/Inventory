package com.inventory.services;

import java.util.List;

import com.inventory.entities.Inventory;

public interface InventoryService {
public List<Inventory> getInventories();

public Inventory addInventory(Inventory inv);


public Inventory updateInventory(Inventory inv);

public void deleteById(Long id);
}
