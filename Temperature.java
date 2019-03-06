import java.util.Scanner;
class Temperature {
	public static void main(String args []) {
	int c , f;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Temperature in centigrade");
	c = sc.nextInt();
	f=c*9/5+32;
	System.out.print("Temperature in Fahrenheit is : " +f);
	}
}