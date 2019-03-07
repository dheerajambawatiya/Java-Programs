import java.util.*;
import java.lang.String.*;

class Palindrome
{
	public static void main(String args[])
	{
		String number,reverse=" ";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to check a palindrome");
		
		number = sc.nextLine();
		int length = number.length();
		
		for(int i=length;i>=0;i--)
		{
			reverse = reverse + number.charAt(i);
		
			if(number.equals(reverse))
			{
				System.out.println("The String is Palindrome.");
			}
			else
				System.out.println("The String is not a Palindrome");
		}
	}
}
		
		
		
		
		
		