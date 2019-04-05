class Abcd {                                                 // Constructor Example
	int a;
	public Abcd() {
		System.out.println("Default Abcd");
	}
	public Abcd(int a) {
		this.a = a;                      
		System.out.println("Parametrized Abcd");
	}
}
class Xyzz extends Abcd {
	int a;
	public Xyzz() {
		super(10);
		System.out.println("Default Xyzz");
	}
	public Xyzz(int a) {
		super(10);
		this.a = a;
		System.out.println("Parametrized Xyzz");
	}
}
class Test11 {
	public static void main(String args[]) {
		Xyzz x = new Xyzz();
	}
}
		