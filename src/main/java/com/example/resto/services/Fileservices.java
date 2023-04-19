package com.example.resto.Services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class Fileservices {
	public String uploadImage(String path,MultipartFile file) {
		
		
		// get incoming file name
		String name=file.getOriginalFilename();
		
		//make full path
		String filepath=path +File.separator+ name;
		
		//create folder if not created
		File f=new File(path);
		if(!f.exists()) {
			f.mkdir();
		}
		
		//copy file
		try {
			Files.copy(file.getInputStream(), Paths.get(filepath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			return name ;
		}
		
		return name;
	}

	public InputStream getImage(String path,String filename) throws FileNotFoundException {
			String fullpath=path +File.separator +filename;
			InputStream is=new 	FileInputStream(fullpath);
		return is;
	}
	
}
