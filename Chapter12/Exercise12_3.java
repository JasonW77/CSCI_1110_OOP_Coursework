//Author Jason Waters
//Date 1/6/2020
//CSCI_1110_Exercise_12_3


import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		
		//create the array
		int[] arrayIndex = new int[100];
		
		//populate the array with random integers
		for (int i = 0; i < arrayIndex.length; i++){
			arrayIndex[i] = (int)(Math.random() * 100);
		}
		/*
		//print the array, used for checking the array population.
		for (int ii = 0; ii < arrayIndex.length; ii++) {
			System.out.print(arrayIndex[ii] + " ");
		}*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter id 0-99: ");
		int id = input.nextInt();
		location(id);
		System.out.println(arrayIndex[id] + " ");
	
	}
	//method for checking the id validity
	public static int location(int id){
		if (id >= 100)  {
			System.out.println("Out of Bounds!");
			System.exit(1);
		}	return id;
	}
}
