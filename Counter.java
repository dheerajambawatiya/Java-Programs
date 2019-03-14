import java.util.Scanner;
class Counter {
	protected int a;
	protected int b;
	protected static int ctr;
	public Counter() {
		ctr++;
	}
	public Counter(int a, int b) {
		this.a=a;
		this.b=b;
		ctr++;
	}
	public static int getCtr() {
		return ctr;
	}
	public void getData() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter A:");
		a = in.nextInt();
		System.out.println("Enter B:");
		b = in.nextInt();
	}
	public void showData() {
		System.out.println("A is : " +a);
		System.out.println("B is : " +b);
	}
	public static void main(String args[]) {
		Counter x = new Counter();
		Counter y = new Counter(1,2);
		Counter z = new Counter(5,6);
		System.out.println("Counter is :" +Counter.getCtr());
	}
}		