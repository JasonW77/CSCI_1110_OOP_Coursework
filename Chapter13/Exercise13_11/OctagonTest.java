//Author Jason Waters
//Date 1/8/2020
//CSCI_1110_Exercise_13_11

package exercise13_11;

public class OctagonTest {
	public static void main(String args[]) {
		
		//Octagon oct = new Octagon();
		
		Octagon oct = new Octagon(2,2,2,2,2,2,2,2);
		
		//oct.clone();
		
		System.out.println("Area of octogon is: " + oct.getArea());
		System.out.println(oct.compare());
		System.out.println(oct.toString());
	
	}
}
