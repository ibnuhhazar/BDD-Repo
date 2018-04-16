package com.test.config;

import java.io.File;
import java.util.Scanner;

public class CobaReaderFile {
	
	private static Scanner x;

	public static void main(String[] args) {
		String filePath = "C:\\FeatureFile\\DataFile\\test.txt";
		String searchTerm = "fhadel";
		
		readRecord(searchTerm, filePath);
	}

	public static void readRecord(String searchTerm, String filePath) {
		boolean found = false;
		String ID = "";
		String username = "";
		String password = "";

		try {
			
			x = new Scanner(new File(filePath));
			x.useDelimiter("[,\n]");

			while (x.hasNext() && !found) {
			
				ID = x.next();
				username = x.next();
				password = x.next();

				if(ID.equals(searchTerm)) {
					System.out.println();
					found = true;
				}
			}

			if(found) {
				System.out.println("ID: " + ID + "User Name: " + username + "Password: " + password);
			} else {
				System.out.println("Record Not Found: ");
			}

		} catch (Exception e) {
			System.out.println(e);
		}	
	}
}
