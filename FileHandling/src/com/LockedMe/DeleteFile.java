package com.LockedMe;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFile {

	public static void delete(String filename) {
		Path path = Paths.get(System.getProperty("user.dir")+"\\"+filename);
		
		try {
			boolean a = Files.deleteIfExists(path);
			if(a==true) {
			System.out.println("File Deleted");
			}
			else {
				System.out.println("File not Found !");
			}
		} catch (NoSuchFileException exce) {
			System.out.println("File not Found !");
			exce.printStackTrace();
		} catch (DirectoryNotEmptyException directoryNotEmptyException) {
			directoryNotEmptyException.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}



}
