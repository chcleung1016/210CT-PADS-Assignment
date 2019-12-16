
public class Circle extends Shape{
	
	private Point center;
	private double radius;
	
	public Circle(double a, double b, double radius) {
		super("Circle");
		this.center = new Point(a,b);
		this.radius = radius;
	}

	public Point getCenter() {
		return this.center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
	
	public String toString( ) {
		return "Center = " + center.toString() + "\nRadius = " + this.radius;
	}
	
}
