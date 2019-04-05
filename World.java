class Hello {
	public Hello() {
		System.out.println("This is default constructor of Hello");
	}
	public Hello(int a) {
		this();
		System.out.println("This is parametrized constructor of Hello");
	}
}
class Xyz extends Hello {
	public Xyz() {
		this(10);
		System.out.println("This is default constructor of Xyz");
	}
	public Xyz(int a) {
		super(10);
		System.out.println("This is parametrized of Xyz");
	}
}
class World {
	public static void main(String args[]) {
		Xyz a = new Xyz();
	}
}