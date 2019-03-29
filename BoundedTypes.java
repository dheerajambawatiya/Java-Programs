class BoundedTypes<T extends Number> {
	T num[];
	public BoundedTypes(T num[]) {
		this.num = num;
	}
	public double average() {
		double sum = 0;
		for(int i=0 ; i<num.length ; i++) {
			sum += num[i].doubleValue();                   //it gives sum value in double type
		}
		return sum / num.length;
	}
	public static void main(String args[]) {
		Integer num[] = {1,2,3,4,5,6,7,8,9};
		BoundedTypes<Integer> obj = new BoundedTypes <Integer>(num);
		System.out.println("Average of num[] is :" +obj.average());
		Double num1[] = {1.1,2.2,3.3,4.4,5.5,6.6};
		BoundedTypes <Double> obj1 = new BoundedTypes <Double>(num1);
		System.out.println("Average of num1[] is :" +obj1.average());
	}
}