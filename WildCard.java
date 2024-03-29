class Stats<T extends Number> {
	T[] nums;
	Stats(T[] o) {
		nums = o;
	}
	double average() {
		double sum = 0.0;
		for (int i=0 ; i<nums.length ; i++) 
			sum+=nums[i].doubleValue();
		return sum/nums.length;
	}
	boolean sameAvg(Stats<?>ob) {
		if(average() == ob.average())
			return true;
		return false;
	}
}
class WildCard {
	public static void main(String args[]) {
		Integer inums[] = {1,2,3,4,5};
		Stats<Integer>iob = new Stats<Integer>(inums);
		double v = iob.average();
		System.out.println("iob average is :" +v);
		Double dnums[] = {1.1,2.2,3.3,4.4,5.5};
		Stats<Double>dob = new Stats<Double>(dnums);
		double w = dob.average();
		System.out.println("dob average is :" +w);
		Float fnums[] = {1.0f,2.0f,3.0f,4.0f,5.0f};
		Stats<Float>fob = new Stats<Float>(fnums);
		double x = fob.average();
		System.out.println("fob average is :" +x);
		System.out.print("Average of iob and dob ");
		if(iob.sameAvg(dob))
			System.out.println("are the same.");
		else
			System.out.println("are differ.");
		System.out.print("Average of dob and fob ");
		if(dob.sameAvg(fob))
			System.out.println("are the same.");
		else
			System.out.println("are differ.");
		System.out.print("Average of iob and fob ");
		if(iob.sameAvg(fob))
			System.out.println("are the same.");
		else
			System.out.println("are differ.");
	}
}