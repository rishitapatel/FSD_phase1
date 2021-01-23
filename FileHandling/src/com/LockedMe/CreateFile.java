package com.LockedMe;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class CreateFile {
	
	public static void createFileClass(String filename) {
		String rootDirectory = System.getProperty("user.dir");
		//Create file instance
		File file = new File(rootDirectory, filename);
		FileWriter fileWriter = null;
		try {
			if(file.createNewFile()) {
				System.out.println("File created!");
			}
				
			else {
				System.out.println("File already exists!");
			}
			
		} catch (IOException e) {
			
			System.out.println("Incorrect file path!");
			e.printStackTrace();
		} 
	}
	

}
