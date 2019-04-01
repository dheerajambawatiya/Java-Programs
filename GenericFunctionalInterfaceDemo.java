interface SomeFunc<T> {
T func (T t);
}
class GenericFunctionalInterfaceDemo {
	public static void main(String args[]) {
		// Use a string based version of SomeFunc.
		StringFunc reverse = (str) -> {   
			String result = "";
			int i;
			for(i=str.length()-1; i>=0; i--)
				result += str.charAt(i);
			return result;
		};
		System.out.println("Lambda reverse is :" +reverse.func("Lambda"));
		System.out.println("Expression reverse is :" +reverse.func("Expression"));		
		// Now use an Integer-based versionof SomeFunc.
		SomeFunc<Integer>factorial = (n) -> {
			int result = 1;
			for(int i=1; i<=n; i++)
				result = i*result;
			return result;
		};
		System.out.println("The factorial of 3 is :" +factorial.func(3));
		System.out.println("The factorial of 6 is :" +factorial.func(6));
	}
}