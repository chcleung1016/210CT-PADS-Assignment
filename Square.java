
public class Square extends Shape{
	
	private Point topLeft;
	private double width;
	
	public Square(double a, double b, double w) {
		super("Square");
		this.width = w;
		this.topLeft = new Point(a, b);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public Point getTopLeft() {
		return this.topLeft;
	}

	public void setTopLeft(Point topLeft) {
		this.topLeft = topLeft;
	}
	
	public double getArea() {
		return this.width * this.width;
	}
	
	public String toString( ) {
		return "TopLeft = " + this.topLeft.toString() +  "\n" + "Width = " + this.width;
	}
	
}
