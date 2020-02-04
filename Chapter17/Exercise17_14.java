//Author Jason Waters
//Date 2/3/2020
//CSCI_1110_Exercise_17_14


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner ;

public class Exercise17_14 {
	
	public static void main(String args[]) throws IOException {
		
		call();
		
		send();
	}
	public static void call() throws FileNotFoundException, EOFException, IOException {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a File name to encrypt from: ");
		String from = scan.next();
		
		try (DataOutputStream output = new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream(from)))){
			while (true)
				System.out.println(input.readDouble());
		}
		catch (EOFException e) {
			System.out.println("End of file reached");
		}
		catch (IOException e) {
			System.out.println("File not found");
		}
		finally {System.out.println("Done");
		
		}
	}
	public static void send() throws FileNotFoundException, EOFException, IOException{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a File name to encrypt to: ");
		String to = scan.next();
		
		try (DataInputStream input = new DataInputStream(
				  new BufferedInputStream(new FileInputStream(to)))) {
			while (true)
				System.out.println(input.readDouble());
		}
		catch (EOFException e) {
			System.out.println("End of file reached");
		}
		catch (IOException e) {
			System.out.println("File not found");
		}
		finally {System.out.println("Done");
		
		}
	}
	
}
