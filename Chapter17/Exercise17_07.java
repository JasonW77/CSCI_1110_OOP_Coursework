//Author Jason Waters
//Date 2/3/2020
//CSCI_1110_Exercise_17_7

import java.io.*;

public class Exercise17_07 {    
	public static void main(String[] args) throws IOException, ClassNotFoundException {        
		
		writeIt();
		readIt();
	}
	public static void writeIt() {
		Loan loan1 = new Loan();        
		Loan loan2 = new Loan(1.8, 10, 10000);
		
		try (                
				ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Exercise17_07.dat"));
				) {            
			output.writeObject(loan1);
			output.writeObject(loan2);
			
			
			}         
		catch (IOException ex) {            
			System.out.println("File could not be opened");
			}
		}
	
	public static void readIt()  throws FileNotFoundException, IOException, ClassNotFoundException   {
		//Object loan;
		
		try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("Exercise17_07.dat"))) {
			while (true) {
				System.out.println(input.readObject());
				
			}
		}
		catch (EOFException ex) {
			System.out.println("End of file reached.");
		}
		finally {
			System.out.print("Final.");
		}
	}
	}
 
