package com.LockedMe;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		System.out.println("ApplicationName:LockedMe.com");
		System.out.println("DeveloperName:Rishita Patel");
		System.out.println("Working Directory = " + System.getProperty("user.dir"));

		Scanner s = new Scanner(System.in);
		int choice = 0;
		String filename = "";
		boolean case4 = false;

		while (true) {

			choice = showMenu(s);
			System.out.println();
			switch (choice) {
			case 1:

				ReadFile.readFiles();
				break;
			case 2:
				while (true) {

					choice = showMenu_1(s);
					System.out.println();
					switch (choice) {
					case 1:

						System.out.println("Enter the file name to be created");
						filename = s.nextLine();

						CreateFile.createFileClass(filename);

						break;

					case 2: {
						System.out.println("Enter the file name to be deleted");
						String filename2 = s.nextLine();
						DeleteFile.delete(filename2);
						
						break;
					}
					case 3:
						System.out.println("Enter the file name to be searched");
						String filename3 = s.nextLine();
						int output = SearchFile.search(filename3);
						if (output == 1) {
							System.out.println("File Found");
						} else {
							System.out.println("File not found");
						}

						break;
					case 4:
						case4 = true;
						break;

					default:
						System.out.println("Enter a valid option");
						break;

					}
					if (case4) {
						break;
					}

				}

				break;

			case 3:

				System.exit(0);
				break;
			default:
				System.out.println("Enter a valid option");
				break;
				
			}

		}

	}

	private static int showMenu(Scanner scanner) {
		System.out.println("***************************************************");
		System.out.println("Please enter the option from the following: ");
		System.out.println("1. Display the file from current Directory.");
		System.out.println("2. To futher select to add, delete, or search file.");
		System.out.println("3. Close the application");
		int choice = Integer.parseInt(scanner.nextLine());
		return choice;
	}

	private static int showMenu_1(Scanner scanner) {
		System.out.println("***************************************************");
		System.out.println("Please enter the option from the following: ");
		System.out.println("1. Add file to current Directory.");
		System.out.println("2. Delete file from current Directory.");
		System.out.println("3. Search file from current Directory.");
		System.out.println("4. Return to main menu.");
		int choice = Integer.parseInt(scanner.nextLine());
		return choice;
	}
}
