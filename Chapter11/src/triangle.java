//Author Jason Waters
//Date 12/19/2019
//CSCI_1110_Exercise_11_1 


public class triangle extends GeometricObject{
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}
	public double getArea() {
		double area = 0;
		double s;
		s = (side1 + side2 + side3)/2;
		area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return area;
	}
	public double getPerimeter() {
		double perimeter = 0;
		perimeter = (side1 + side2 + side3);
		return perimeter;
	}
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}