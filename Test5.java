class Test5 {
	{                                                   		//This is anonymous block.
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