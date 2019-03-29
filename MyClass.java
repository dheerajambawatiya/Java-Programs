interface MyInterface<T> {
	void sayMessage(T t);
}
class MyClass implements MyInterface<String> {
	public void sayMessage(String t) {
		System.out.println(t);
	}
	public static void main(String args[]) {
		MyClass obj = new MyClass();
		obj.sayMessage("Hello World");
	}
}
                              // Generic Interfaces
	