abstract class Figure {
	double dim1;
	double dim2;
	Figure(double a , double b) {
		dim1 = a;
		dim2 = b;
	}
	abstract double area();
}
class Rectangle extends Figure {
	Rectangle(double a, double b) {
		super(a , b);
	}
	double area() {
		System.out.println("Inside area for rectangle");
		return dim1 * dim2;
	}
}
class Triangle extends Figure {
	Triangle(double a , double b) {
		super (a, b);
	}
	double area() {
		System.out.println("Inside area for triangle");
		return dim1 * dim2 / 2;
	}
}
class AbstractAreas {
	public static void main(String args[]) {
		Rectangle r = new Rectangle(9,5);
		Triangle t = new Triangle(10,8);
		Figure fig;
		fig = r;
		System.out.println("Area is :" +fig.area());
		fig = t;
		System.out.println("Area is :" +fig.area());	
	}
}