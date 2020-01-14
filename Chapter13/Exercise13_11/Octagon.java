//Author Jason Waters
//Date 1/14/2020
//CSCI_1110_Exercise_13_11

package exercise13_11;

public class Octagon extends GeometricObject implements Cloneable, Comparable<Object>{
	private double side1 = 1.0;
	
	
	public Octagon(){
		this.side1 = 1.0;
		
	}
	public Octagon(double side1) {
		this.side1 = side1;
	
	}
	public double getSide1() {
		return side1;
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
		perimeter = (side1 * 8);
		return perimeter;
	}
	
	public String toString() {
		return "Octagon:  " + side1;
	}
}
