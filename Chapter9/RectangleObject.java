public class RectangleObject {
	
	public static void main(String args[]) {
		
		Rectangle def;
		def = new Rectangle();
		
		Rectangle spec1;
		spec1 = new Rectangle(4, 40);
		
		Rectangle spec2;
		spec2 = new Rectangle(3.5, 35.9);
		
		
		
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


/*
A no-arg constructor that creates a default rectangle.
A constructor that creates a rectangle with the specified width and height.
A method named getArea() that returns the area of this rectangle.
A method named getPerimeter() that returns the perimeter.
Create the Rectangle object class. 
Write a test program that creates two Rectangle objects—one with width 4 and height 40 and the other with width 3.5 and height 35.9. 
Display the width, height, area, and perimeter of each rectangle in this order. */
