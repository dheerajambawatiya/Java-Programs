class MultiCatch {
	public static void main(String args[]) {
		try {
			int a = args.length;
			System.out.println("a : " + a);
			int b = 42 / a;
			int c[] = {1};
			c[42] = 99;
		}
		catch (ArithmeticException e) {
			System.out.println("Divided by zero : " +e);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index oob: "+e);
		}
		System.out.println("After try/catch blocks.");
	}
}
 // This gives division by zero Exception if it is started with no command lines

 // After trying java MultiCatch TestArg
	
// it will cause an ArrayIndexOutOfBoundsException since the int array c has a length of 1.