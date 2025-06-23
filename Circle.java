package lab4;

public class Circle {
	Point mid;
	double radius;
	
	public Circle(Point mid, double radius){
		this.mid = mid;
		this.radius = radius;
	}
	
	public double circumference() {
		return Math.PI*2*radius;
	}
	
	public double area() {
		return Math.PI*Math.pow(radius, 2);
	}
	
	public boolean pointOnCircle(Point p) {
		return mid.distance(p) == radius;
	}
}
