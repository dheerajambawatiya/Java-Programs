class Abc {
	public void show() {
		System.out.println("show from abc");
	}
	public void display() {
		System.out.println("Display from abc");
	}
}
class Test6 {
	public static void main(String args[]) {
		Abc obj = new Abc();
		obj.show();
		obj.display();
		Abc obj1 = new Abc() {
			public void display() {
				System.out.println("Overriden display");
			}
		};
		obj1.show();
		obj1.display();
		new Abc() {
			public void display() {
				System.out.println("another overriden display");
			}
		}.display();
	}
}

  			//Anonymous inner class.
		