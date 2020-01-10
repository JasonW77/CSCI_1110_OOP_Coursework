//Author Jason Waters
//Date 1/8/2020
//CSCI_1110_Exercise_13_7



public abstract class GeometricObject implements colorable{
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}
	public GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	public String howToColor(){
		return "Color all three sides";
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
	public abstract double getArea() {
		return area;
	}
	public abstract double getPerimeter() {
		return perimeter;
	}
}
