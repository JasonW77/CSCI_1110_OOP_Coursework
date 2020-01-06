//Author Jason Waters
//Date 1/6/2020
//CSCI_1110_Exercise_12_3


import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
	
		double[] arrayIndex = new double[100];
		
		for (int i = 0; i < arrayIndex.length; i++){
			arrayIndex[i] = Math.random() * 100;
		}
		
		for (int ii = 0; ii < arrayIndex.length; ii++) {
			System.out.print(arrayIndex[ii] + " ");
		}
		Scanner input = new Scanner(System.in);
		
		for (int l = 0; l < 10; l++){
			System.out.println();
			System.out.println("Enter id 0-99: ");
			int id = input.nextInt();
			location(id);
			System.out.println(arrayIndex[id] + " ");
			
		}
	
	}
	public static int location(int id){
		if (id >= 100)  {
			System.out.println("Out of Bounds!");
			System.exit(1);
		}	return id;
		}
}