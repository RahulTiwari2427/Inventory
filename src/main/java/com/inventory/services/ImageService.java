package com.inventory.services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface ImageService {
	String uploadImage(String path,MultipartFile file);

}
