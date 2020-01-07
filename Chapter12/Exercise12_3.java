//Author Jason Waters
//Date 1/7/2020
//CSCI_1110_Exercise_12_3


import java.util.Scanner;

public class Exercise12_3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//create the array
		int[] arrayIndex = new int[100];
		
		//populate the array with random integers
		for (int i = 0; i < arrayIndex.length; i++){
			arrayIndex[i] = (int)(Math.random() * 100);
		}
		
		System.out.println("Enter id 0-99: ");
		int id = input.nextInt();
		
		try {
			if (id >= 100)  {
				throw new ArrayIndexOutOfBoundsException("Value out of bounds");
			}
			System.out.println(arrayIndex[id] + " ");
		}
		catch (ArrayIndexOutOfBoundsException ex){
			System.out.println("Value out of Bounds");
		}
	}
}

