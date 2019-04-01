interface StringFunc {
	String func(String n);
}
public class LambdaAsArgument {
	static String stringOp(StringFunc sf, String s) {
		return sf.func(s);
	}
	public static void main(String args[]) {
		String inStr = "Lambda add power to program";
		String outStr;
		System.out.println("Here is input string :" +inStr);
		outStr = stringOp((str) -> str.toUpperCase(),inStr);
		System.out.println("The string in upper case :" +outStr);
		outStr = stringOp((str) -> {
			String result = "";
			int i;
			for(i=0; i<str.length(); i++)
				if(str.charAt(i) != ' ')
				result += str.charAt(i);
			return result;
		} ,inStr);
		System.out.println("The string with space removed :" +outStr);
		StringFunc reverse = (str)-> {
			String result = "";
			int i;
			for(i=str.length()-1; i>=10;i--)
				result += str.charAt(i);
			return result;
		};
		System.out.println("The string reversed :" +stringOp(reverse, inStr));
	}
}
	