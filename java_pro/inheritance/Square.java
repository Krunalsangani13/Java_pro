package inharetance;

public class Square extends Rectangle {

	Square(double side) {
		super(side,side);
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

