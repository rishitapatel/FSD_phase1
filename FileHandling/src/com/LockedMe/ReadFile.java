package com.LockedMe;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReadFile {
	
	
	public static void readFiles() {
		File file = new File(System.getProperty("user.dir"));
		File[] files = file.listFiles();
		List<String> files2 = new ArrayList<String>();
		
		
	
		for(File eachFile : files) {
			/*if(eachFile.isDirectory()) {
				File[] folderFiles = eachFile.listFiles();
				for(File fl : folderFiles) {
					files2.add(fl.getName());
				}
			} 
			else */
				files2.add(eachFile.getName());
		}
		
		Collections.sort(files2);
		if(files2.isEmpty()) {
		 System.out.println("Directory is empty");
		}
		else {
			for(String s : files2) {
				System.out.println(s);
			}
		}
	}

	public static File[] returnFiles() {
		File file = new File(System.getProperty("user.dir"));
		File[] files = file.listFiles();
		return files;
	}
	
		

}
