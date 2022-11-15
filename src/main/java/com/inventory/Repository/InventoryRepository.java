package com.inventory.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventory.entities.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

}
