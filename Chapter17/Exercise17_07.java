/* * To change this license header, choose License Headers in Project Properties. 
 * * To change this template file, choose Tools | Templates 
 * * and open the template in the editor. *
 * //** * * @author rmazorow */
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
 
