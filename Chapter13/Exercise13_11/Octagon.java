//Author Jason Waters
//Date 1/14/2020
//CSCI_1110_Exercise_13_11

package exercise13_11;

public class Octagon extends GeometricObject implements Cloneable, Comparable<Object>{
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	private double side4 = 1.0;
	private double side5 = 1.0;
	private double side6 = 1.0;
	private double side7 = 1.0;
	private double side8 = 1.0;
	
	public Octagon(){
		this.side1 = 1.0;
		this.side2 = 1.0;
		this.side3 = 1.0;
		this.side4 = 1.0;
		this.side5 = 1.0;
		this.side6 = 1.0;
		this.side7 = 1.0;
		this.side8 = 1.0;
	}
	public Octagon(double side1, double side2, double side3, double side4, double side5, double side6, double side7, double side8) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.side4 = side4;
		this.side5 = side5;
		this.side6 = side6;
		this.side7 = side7;
		this.side8 = side8;
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
	public double getSide4() {
		return side4;
	}
	public double getSide5() {
		return side5;
	}
	public double getSide6() {
		return side6;
	}
	public double getSide7() {
		return side7;
	}
	public double getSide8() {
		return side8;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();	
	}
	@Override
	public int compareTo(Object o) {
		if (getArea() > ((Octagon) o).getArea())
			return 1;
		else if (getArea() < ((Octagon) o).getArea())
			return -1;
		else 
			return 0;
	}
	@Override
	public double getArea() {
  		double area = 0;
		double s;
		s = side1;
		area = (2+(4/Math.sqrt(2)))*s*s;
		return area;
	}
	@Override
	public double getPerimeter() {
 	 	double perimeter = 0;
		perimeter = (side1 + side2 + side3 + side4 + side5 + side6 + side7 + side8);
		return perimeter;
	}
	
	public String toString() {
		return "Octagon: side1: " + side1 + ", side2: " + side2 + ", side3: " + side3 + ", side4: " + side4 + ", side5: " + side5 + ", side6: " + side6 + ", side7: " + side7 + ", side8: " + side8;
	}
}
