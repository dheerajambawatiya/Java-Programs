import java.io.IOException;
class Abc {
	private static int convert(String s) {
		return Integer.parseInt(s);
	}
	public Object getMessage() {
		return "Hello World";
	}
	public static void main(String args[]) {
		System.out.println("Abc");
	}
}
class Xyz extends Abc {
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

//compile by javac Abc.java
	// run by java Abc   &&    java Xyz.