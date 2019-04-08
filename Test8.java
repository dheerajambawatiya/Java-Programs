class Abc {
	static class Xyz {
		public void show() {
			System.out.println("Show from Xyz");
		}
		public static void display () {
			System.out.println("Display from Xyz");
		}
	}
	public void check() {
		Xyz x = new Xyz();
		x.show();
	}
}
class Test8 {
	public static void main(String args[]) {
		Abc a = new Abc();
		a.check();
		//Creating an object of inner class outside the outer class
		Abc.Xyz obj = new Abc.Xyz();
		obj.show();
		Abc.Xyz.display();
	}
}
