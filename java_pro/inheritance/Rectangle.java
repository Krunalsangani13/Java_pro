package inharetance;

public class Rectangle {
	
	protected double length,breadth;

	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public void printArea() {
		double area=length*breadth;
		System.out.println("Area of the rectangle: " + area);
	}
	
	public void printPerimeter() {
		double perimeter=2*(length+breadth);
		System.out.println("Perimeter of the rectangle: " + perimeter);
	}
}
