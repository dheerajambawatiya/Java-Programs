import java.util.Scanner;
class Rectangle {
	public static void main(String args []) {
	float width , height , area=0 , perimeter=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Width");
	width = sc.nextFloat();
  	System.out.println("Enter Height");
	height = sc.nextFloat();
	area = height*width;
	perimeter = 2*(height+width); 
	System.out.println("Area is :" + area +"\nPerimeter is :" + perimeter);
	}
}