class Abc {
	class Xyz {
		public void show() {
			System.out.println("show from Xyz");
		}
	}
	public void check() {
		Xyz x = new Xyz();
		x.show();
	}
}
class Test7 {
	public static void main(String args[]) {
		Abc a = new Abc();
		a.check();
		//Creating an object of inner class outside the outer class
		Abc a1 = new Abc();                 
		Abc.Xyz obj = a1.new Xyz();
		obj.show();
		//Creating an object of inner class outside the outer class
		Abc.Xyz obj1 = new Abc().new Xyz();
		obj1.show();
	}
}
 // Member Inner Class