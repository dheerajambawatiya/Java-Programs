class Gen2<T , V> {
	T a;
	V b;
	public Gen2() {
	}
	public Gen2(T a , V b) {
		this.a = a;
		this.b = b;
	}
	public void setA(T a) {
		this.a = a;
	}
	public T getA() {
		return a;
	}
	public void setB(V b) {
		this.b = b;
	}
	public V getB() {
		return b;
	}
	public void showType() {
		System.out.println("Type ot T is :" + a.getClass().getName());
		System.out.println("Type ot V is :" + b.getClass().getName());
	}
	public static void main(String args[]) {
		Gen2<Integer , String> obj = new Gen2<Integer , String>();
		obj.setA(10);
		obj.setB("Hello");		
		System.out.println("Value :" + obj.getA());
		System.out.println("Value :" + obj.getB());
		obj.showType();
	}
}
		