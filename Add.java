public class Add {
	public static void main(String args []) {
		int sum = 0;
		for(int i=0 ; i<args.length ; i++) {
			sum = sum + Integer.parseInt(args[i]);
		}
		System.out.println("The sum of the arguments passed is :" +sum);
	}
}

// run as java Add + values you want to add
  // e.g. java Add 12 11 44