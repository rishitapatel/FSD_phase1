package com.LockedMe;

import java.io.File;

public class SearchFile {
	
	public static int search(String  x) {
		File[] files= ReadFile.returnFiles();
		

			for(File fl : files) {
				String[] x1=fl.getName().split("\\.");
				String x2=x1[0];
				if(x2.equals(x)) {
					return 1;
				}
			}
		
		return -1;
	}
	

	
}
