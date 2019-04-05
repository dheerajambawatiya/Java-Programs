interface Ia {
	void a();
}
interface Ib {
	void b();
}
interface Ic extends Ia , Ib {
	void c();
}
abstract class Cc implements Ic {
	public void a() {
		System.out.println("a");
	}
}
class DerivedCc extends Cc {
	public void b() {
		System.out.println("b");
	}
	public void c() {
		System.out.println("c");
	}
	public void d() {
		System.out.println("d");

	}
}
class Relationship {
	public static void main(String args[]) {
		Ia obj = new DerivedCc();
		System.out.println(obj instanceof Ia);
		System.out.println(obj instanceof Ib);
		System.out.println(obj instanceof Ic);
		System.out.println(obj instanceof Cc);
		System.out.println(obj instanceof DerivedCc);
	}
}