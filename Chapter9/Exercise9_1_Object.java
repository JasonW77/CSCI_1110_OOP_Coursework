// Author Jason Waters
// Date 12/3/2019
// CSCI_1110_Assignment_9_1


//RectangleObject class
public class Exercise9_1_Object {
	
	public static void main(String args[]) {
		//Default Constructor
		Rectangle def;
		def = new Rectangle();
		// Spec1 or 4 x 40 constructor
		Rectangle spec1;
		spec1 = new Rectangle(4, 40);
		// Spec2 or 3.5 x 35.9 constructor
		Rectangle spec2;
		spec2 = new Rectangle(3.5, 35.9);
		
		
		// Print out for the 3 Rectangles
		System.out.println("\nDefault Rectangle");
		System.out.println("The Width of the default rectangle is: " + def.getWidth());
		System.out.println("The Heigth of the default rectangle is: " + def.getHeight());
		System.out.println("The Area of the default rectangle is: " + def.getArea());
		System.out.println("The Perimeter of the default rectangle is: " + def.getPerimeter());
		System.out.println("\n4 x 40 Rectangle");
		System.out.println("The Width of the 4 x 40 rectangle is: " + spec1.getWidth());
		System.out.println("The Heigth of the 4 x 40 rectangle is: " + spec1.getHeight());
		System.out.println("The Area of the 4 x 40 rectangle is: " + spec1.getArea());
		System.out.println("The Perimeter of the 4 x 40 rectangle is: " + spec1.getPerimeter());
		System.out.println("\n3.5 x 35.9 Rectangle");
		System.out.println("The Width of the 3.5 x 35.9 rectangle is: " + spec2.getWidth());
		System.out.println("The Heigth of the 3.5 x 35.9 rectangle is: " + spec2.getHeight());
		System.out.println("The Area of the 3.5 x 35.9 rectangle is: " + spec2.getArea());
		System.out.println("The Perimeter of the 3.5 x 35.9 rectangle is: " + spec2.getPerimeter());
	}
}
