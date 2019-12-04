// Author Jason Waters
// Date 12/3/2019
// CSCI_1110_Exercise_9_1


//Rectangle class
public class Rectangle{
	
	double width;
	double height;
	double area;
	double peri;

	public Rectangle(){
		this.width = 1;
		this.height = 1;
	}
	public Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	public void	setWidth(double newWidth){
		this.width = newWidth;
	}
	public void setHeigth(double newHeight){
		this.height = newHeight;
	}
	public double getWidth(){
		return this.width;
	}
	public double getHeight(){
		return this.height;
	}
	public double getArea(){
		return (this.height * this.width);
	}
	public double getPerimeter(){
		return (this.width * 2) + (this.height * 2);
	}
}
