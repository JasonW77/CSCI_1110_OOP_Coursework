//Author Jason Waters
//Date 2/3/2020
//CSCI_1110_Exercise_17_3


import java.io.*;
import java.math.*;

public class Exercise17_3 {
	public static void main(String[] args) throws IOException {
		
		writeEmUp();
		addEmUp();
		
	}
	
	public static void writeEmUp() throws FileNotFoundException, IOException {
		
		try (DataOutputStream output = new DataOutputStream(new FileOutputStream("Exercise17_3.dat"))) {
			for (int i = 0; i <= 100; i++) {
				output.writeInt((int) (Math.random() * 100));
			}
			
		}
		try (DataInputStream input = new DataInputStream(new FileInputStream("Exercise17_3.dat"))) {
			while (true) {
			 int num = input.readInt();
			 System.out.print(" " + num);
			}
		}catch (EOFException ex) {
			System.out.println("End of file reached 1.");
		}
	}
	public static void addEmUp() throws FileNotFoundException, IOException   {
		int sum = 0;
		
		try (DataInputStream input = new DataInputStream(new FileInputStream("Exercise17_3.dat"))) {
			while (true) {
				sum += input.readInt();
			}
		}
		catch (EOFException ex) {
			System.out.println("End of file reached 2.");
		}
		finally {
			System.out.print(sum);
		}
	}
}
	


