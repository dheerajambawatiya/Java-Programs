import java.util.Scanner;
class CircleArea {
	public static void main(String args []) {
	float radius, area=0, circ=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Radius");
	radius = sc.nextFloat();
	area = 3.14f*radius*radius;
	circ = 2*3.14f*radius; 
	System.out.println("Area is :" + area +"\nCircumference is :" + circ);
	}
}