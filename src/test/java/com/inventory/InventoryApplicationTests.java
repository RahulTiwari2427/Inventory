package com.inventory;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.inventory.Repository.InventoryRepository;
import com.inventory.entities.Inventory;

@SpringBootTest
class InventoryApplicationTests {

	
	@Autowired
	private InventoryRepository inventory;
	
	
	@Test
	void contextLoads() {
		System.out.println(inventory);
	}

}
