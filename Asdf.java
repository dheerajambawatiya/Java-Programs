abstract class Shape {
	private double width;
	private double height;
	public Shape(double width , double height) {
		this.width = width;
		this.height = height;
	}
	public final double getWidth() {
		return width;
	}
	public final double getHeight() {
		return height;
	}
	abstract double getArea();
}
class Rectangle extends Shape {
	public Rectangle(double width , double height) {
		super(width , height);
	}
	@Override
	final double getArea() {
		return this.getHeight() * this.getWidth();
	}
}
class Square extends Shape {
	public Square (double side) {
		super(side , side);
	}
	@Override
	final double getArea() {
		return this.getHeight() * this.getWidth();
	}
}
public class Asdf {
	public static void main(String args[]) {
		Shape s1 = new Rectangle(10,20);
		Shape s2 = new Square(10);
		System.out.println("Width of s1 :" + s1.getWidth());
		System.out.println("Height of s1 :" + s1.getHeight());
		System.out.println("Width of s2 :" + s2.getWidth());
		System.out.println("Height of s2 :" + s2.getHeight());
		System.out.println("Area of s1 :" + s1.getArea());
		System.out.println("Area of s2 :" + s2.getArea());
	}
}