//Author Jason Waters
//Date 1/14/2020
//CSCI_1110_Exercise_13_11

package exercise13_11;

public class OctagonTest {
	public static void main(String args[]) throws CloneNotSupportedException {
		
		//Octagon oct = new Octagon();
		
		Octagon oct1 = new Octagon(2);
		
		Octagon oct2 = (Octagon)oct1.clone() ;
		
		System.out.println("Area of oct1 is: " + oct1.getArea());
		System.out.println("Area of oct2 is: " + oct2.getArea());
		System.out.println(oct1.compareTo(oct2));
		System.out.println(oct1.toString());
		System.out.println(oct2.toString());
	}
}
