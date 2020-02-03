//Author Jason Waters
//Date 2/3/2020
//CSCI_1110_Exercise_17_1


import java.io.*;
import java.math.*;

public class Exercise17_1 {
	public static void main(String[] args) throws IOException {
			
		try {
			try (DataOutputStream output = new DataOutputStream(new FileOutputStream("Exercise17_1.txt"))) {
				for (int i = 0; i <= 100; i++) {
					output.writeInt((int) (Math.random() * 100));
				}
			}
			try (DataInputStream input = new DataInputStream(new FileInputStream("Exercise17_1.txt"))) {
				while (true)
					System.out.print(" " + input.readInt());
				
			}
		
		}
		catch (EOFException ex) {
			System.out.println(" End of file reached.");
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
	


