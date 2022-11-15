package com.inventory.services;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


@Service
public class ImageServiceImpl implements ImageService {

	@Override
	public String uploadImage(String path, MultipartFile file)   {
		
		String name=file.getOriginalFilename();
		
		String filePath=path+File.separator+name;
		
		File f =new File(path);
		
		if(!f.exists()) {
			f.mkdir();
		}
		
		try {
			Files.copy(file.getInputStream(), Paths.get(filePath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return name;
	}

}
