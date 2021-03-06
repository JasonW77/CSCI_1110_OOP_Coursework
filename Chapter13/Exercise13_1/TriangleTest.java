package exercise13_1;

//Author Jason Waters
//Date 1/13/2020
//CSCI_1110_Exercise_13_1 

import java.util.Scanner;
public class TriangleTest{
	public static void main(String args[]) {

		Scanner input= new Scanner(System.in);
		//triangle tri = new triangle();
		boolean filled = false;

		System.out.println("Enter three sides of the triangle: Side 1: ");
		double side1 = input.nextDouble(); 
		System.out.println("Enter Side 2: ");
		double side2 = input.nextDouble();
		System.out.println("Enter Side 3: ");
		double side3 = input.nextDouble();
		System.out.println("Enter a color: ");
		String color = input.next();
		System.out.println("Is the Triangle Filled?: (true/false)");
		String fill = input.next();
			if (fill.equalsIgnoreCase("true")) {
				filled = true;
			}
			else if (fill.equalsIgnoreCase("false")) {
				filled = false;
			}
		triangle tri = new triangle(side1, side2, side3);
		tri.setColor(color);
		tri.setFilled(filled);

		System.out.println("Area of the triangle is: " + tri.getArea());
		System.out.println("Perimeter of the triangle is: " + tri.getPerimeter());
		System.out.println("Color of Triangle is: " +tri.getColor());
		//System.out.println("Date Created: " + tri.getDateCreated());
		System.out.println("Trinangle filled: " + tri.isFilled());
		System.out.println(tri.toString());
		}

	}
}
