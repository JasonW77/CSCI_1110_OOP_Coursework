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
		//get input from user.
		String from = " ";
		String to = " ";
		System.out.print("Enter a File name to encrypt from: ");
		Scanner scan = new Scanner(System.in);
		from = scan.next();
		System.out.print("Enter a File name to decrypt to: ");
		to = scan.next();
		
		// write non-encrypted from file
		try (FileOutputStream output = new FileOutputStream(from)){
			for (int i = 1; i <= 10; i++)
				output.write(i);
		}
		
		//read file to the array list and encode by adding 5
		try	(FileInputStream input = new FileInputStream(from)){
			while ((value = input.read()) != -1)
				list.add(value + 5);
			/*	
			 //this is here just to show what is printed to the array list.
			for (int i2 = 0; i2 < list.size(); i2++)
				System.out.print(list.get(i2) + " ");
			*/
		}
		// read the array list and encrypt to new file
		try (FileOutputStream output = new FileOutputStream(from)){
			for (int i = 0; i < list.size(); i++)
				output.write(list.get(i));
			
		}
		
		// read and undo-encryption from file, write to file
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
