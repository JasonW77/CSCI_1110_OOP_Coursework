//Author Jason Waters
//Date 1/8/2020
//CSCI_1110_Exercise_13_11


public class octagon extends GeometricObject implements cloneable cloneable{
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
  private double side4 = 1.0;
	private double side5 = 1.0;
	private double side6 = 1.0;
	private double side7 = 1.0;
	private double side8 = 1.0;
	
	public octagon(){
		this.side1 = 1.0;
		this.side2 = 1.0;
		this.side3 = 1.0;
    this.side4 = 1.0;
		this.side5 = 1.0;
		this.side6 = 1.0;
		this.side7 = 1.0;
		this.side8 = 1.0;
	}
	public octagon(double side1, double side2, double side3, double side4, double side5, double side6, double side7, double side8) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
    this.side1 = side4;
		this.side2 = side5;
		this.side3 = side6;
		this.side2 = side7;
		this.side3 = side8;
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
		return side1;
	}
	public double getSide5() {
		return side2;
	}
	public double getSide6() {
		return side3;
	}
  public double getSide7() {
		return side1;
	}
	public double getSide8() {
		return side2;
	}
	public String toString() {
		return "Octagon: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3 "side4 = " + side4 + " side5 = " + side5 + " side6 = " + side6 + " side7 = " + side7 + " side8 = " + side8;
	}
}
