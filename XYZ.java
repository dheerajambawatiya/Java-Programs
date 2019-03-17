class Calculation {
	int a;
	public void addition(int b, int c) {
		a = b + c;
		System.out.println("The sum is :" + a);
	}
	public void substraction (int b , int c) {
		a = b - c;
		System.out.println("The difference is :" +a);
	}
}
public class Xyz extends Calculation {
	public void multiplication(int b , int c) {
		a = b * c;
		System.out.println("Product is :" +a);
	}
	public static void main(String args[]) {
		int b = 10 , c = 20;
		Xyz in = new Xyz();
		in.addition(b ,c);
		in.substraction(b ,c);
		in.multiplication(b ,c);
	}
}