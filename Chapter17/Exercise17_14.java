//Author Jason Waters
//Date 2/5/2020
//CSCI_1110_Exercise_17_14 & 15


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner ;

public class Exercise17_14 {
	
	public static void main(String args[]) throws IOException {
		int value;
		ArrayList<Integer> list = new ArrayList<>();
		String from = " ";
		String to = " ";
		
		//get file name input from user.
		System.out.print("Enter a File name to encrypt from: ");
		Scanner scan = new Scanner(System.in);
		from = scan.next();
		System.out.print("Enter a File name to decrypt to: ");
		to = scan.next();
		
		// create and/or write to non-encrypted "from" file
		try (FileOutputStream output = new FileOutputStream(from)){
			for (int i = 1; i <= 10; i++)
				output.write(i);
		}
		
		// read "from" file to the array list and encode by adding 5
		try	(FileInputStream input = new FileInputStream(from)){
			while ((value = input.read()) != -1)
				list.add(value + 5);
		}
		
		// read data from the array list and encrypt back to the "from" file
		try (FileOutputStream output = new FileOutputStream(from)){
			for (int i = 0; i < list.size(); i++)
				output.write(list.get(i));
		}
		
		// read "from" file and undo-encryption by subtracting 5, write data to "to" file
		try {
			FileOutputStream output = new FileOutputStream(to);
			FileInputStream input = new FileInputStream(from);
			
			while ((value = input.read()) != -1)
				output.write(value - 5);
			
		}
		catch (FileNotFoundException ex) {
			System.out.print("File not found");
		}
		
	}
	
}
