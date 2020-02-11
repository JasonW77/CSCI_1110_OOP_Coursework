//Author Jason Waters
//Date 2/11/2020
//CSCI_1110_Exercise_18_3



import java.util.Scanner;

public class GCDTest {
	public static void main(String [] args){
		int n1 = 0, n2 = 0;
		Scanner input = new Scanner(System.in);
		
		//Prompt user to Enter the two integers to compute
		System.out.println("Enter two integers for computation.");
		System.out.println("First Integer: ");
		n1 = input.nextInt();
		System.out.println("Second Integer: ");
		n2 = input.nextInt();
		
		//compute GCD of the two integers
		System.out.println("GCD is: " + gcd(n1, n2));
		
	}

	public static int gcd(int n1, int n2){
		
	    if (n2 != 0)
		   return gcd(n2, n1 % n2);
		else
		   return n1;
	 	}
		
	
}
