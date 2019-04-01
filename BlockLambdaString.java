interface StringFunc {
	String func(String n);
}
class BlockLambdaString {
	public static void main(String args[]) {
		StringFunc reverse = (str) -> {    //This block lambda reverse character string.
			String result = "";
			int i;
			for(i=str.length()-1; i>=0; i--)
				result += str.charAt(i);
			return result;
		};
		System.out.println("Lambda reverse is :" +reverse.func("Lambda"));
		System.out.println("Expression reverse is :" +reverse.func("Expression"));		
	}
}