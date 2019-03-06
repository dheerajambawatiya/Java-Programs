import java.util.Scanner;
class AcceptShowDataByClass {
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int a) {
		x=a;
	}
	public int getY() {
		return y;
	}
	public void setY(int a) {
		y=a;
	}
	public void acceptData() {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter X :");
		x = a.nextInt();
		System.out.println("Enter Y :");
		y = a.nextInt();
	}
	public void showData() {
		System.out.println("X:" +x);
		System.out.println("Y:" +y);
	}
	public static void main (String args[]) {
	Point p = new Point();
	p.acceptData();
	p.showData();
	}
}