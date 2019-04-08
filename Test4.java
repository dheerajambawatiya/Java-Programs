class Test4 {
	static {
		class Abc {
			public void show() {
				System.out.println("Show from abc");
			}
		}
		Abc obj = new Abc();
		obj.show();
	}
	public static void main(String args[]) {
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		Test t4 = new Test();
	}
}

// it is an example of static block.
	// if there is a static block in program it runs only once.