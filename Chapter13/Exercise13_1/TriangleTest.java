package exercise13_7;

//Author Jason Waters
//Date 1/13/2020
//CSCI_1110_Exercise_13_1 

public class TriangleTest{
	public static void main(String args[]) {

		
		//triangle tri = new triangle();
		
		Triangle[] objarray = new Triangle[5]; 
		
		for (int i = 0; i < objarray.length; i++) {
			objarray[i] = new Triangle((Math.random() *10), (Math.random() *10), (Math.random() *10));
		}
		for (int i = 0; i < objarray.length; i++) {
	
			System.out.println("Area of object # "+ i + " is: " + objarray[i].getArea());
			System.out.println(objarray[i].howToColor());
			System.out.println(objarray[i].toString());
		
		}
		
	}
}
