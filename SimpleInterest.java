import java.util.Scanner;
class SimpleInterest {
	public static void main(String args []) {
	float p , r , t , si=0 ;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Princliple");
	p = sc.nextFloat();
	System.out.println("Enter Rate");
	r = sc.nextFloat();
	System.out.println("Enter Time");
	t = sc.nextFloat();
	si =(p*r*t);
	System.out.println("Simple interest is :" + si);
	}
}