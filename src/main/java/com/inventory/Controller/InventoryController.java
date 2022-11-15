package com.inventory.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.inventory.Repository.InventoryRepository;
import com.inventory.entities.Inventory;
import com.inventory.load.FileResponse;
import com.inventory.services.ImageService;
import com.inventory.services.InventoryService;

@RestController
@RequestMapping("/image")
public class InventoryController {
	@Autowired
	private InventoryService invenService;
	
	@Autowired
	private ImageService imageService;

	@Value("${project.image}")
	private String path;
		
		
		
	@PostMapping("/update")
		public ResponseEntity<FileResponse> imageUpload(@RequestParam("image") MultipartFile image){
			
			String fileName = this.imageService.uploadImage(path, image);
			
			return new ResponseEntity<>(new FileResponse(fileName,"Image Accepted!!"),HttpStatus.OK);
		
	}
		
		@GetMapping("/inventory")
		public List<Inventory> getinventories(){
			return this.invenService.getInventories();
		}
		@PostMapping("/save")
		public Inventory saveInventory(@RequestBody Inventory inv) {
			
			return  this.invenService.addInventory(inv);
		}
		@PutMapping("/update")
		public Inventory updateInventory(@RequestBody Inventory inv) {
			 
			return this.invenService.updateInventory(inv);
		}
		 
		@DeleteMapping("/delete/{id}")
		public void delete(@PathVariable("id") long id) {
			invenService.deleteById(id);
			
			
		}
		
		
}
