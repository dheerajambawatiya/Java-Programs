class Fruits {
	public void show() {
		System.out.println("Show from fruits");
	}
	public static void display() {
		System.out.println("Display static from fruits");
	}
}
class Apple extends Fruits {
	public void show() {
		System.out.println("Show from apple");
	}
	public static void display() {
		System.out.println("Display static from apple");
	}
}
class Mango extends Fruits {
	public void show() {
		System.out.println("Show from Mango");
	}
	public static void display() {
		System.out.println("Display static from Mango");
	}
}
class Fruits1 {
	public static void main(String args[]) {
		Fruits obj = new Fruits();
		obj.show();
		obj.display();
		Apple obj1 = new Apple();
		obj1.show();
		obj1.display();
		Fruits obj2 = new Apple();
		obj2.show();
		obj2.display();
		Apple obj3 = new Apple();
		Fruits obj4 = obj3;
		obj4.show();
		Apple obj5 = new Apple();
		Fruits obj6 = obj5;
		if(obj6 instanceof Mango) {
			Mango obj7 = (Mango)obj6;
			obj7.show();
			obj7.display();
		}
	}
}
