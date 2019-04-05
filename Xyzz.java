import java.io.IOException;
class Abc {
	private static int convert(String s) {
		return Integer.parseInt(s);
	}
	public object getMessage() {
		return "Hello World";
	}
	public static void main(String args[]) {
		System.out.println("Abc");
	}
}
class Xyzz extends Abc {
	public static int convert(String s) throws IOException {
		return Integer.parseInt(s);
	}
	public String getMessage() {
		return "Hello World";
	}
	public static void main(String args []) {
		System.out.println("Xyz");
	}
}