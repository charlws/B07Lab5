package lab4;

public class Rectangle {
	double length;
	double width;
	Point topLeft;
	public Rectangle(double length, double width, Point topLeft) {
		this.length = length;
		this.width = width;
		this.topLeft = topLeft;
	}
	
	public double area() {
		return length*width;
	}
	
	public double perimeter() {
		return 2*length + 2*width;
	}
	
	public boolean isSquare() {
		return length == width;
	}
	
}
