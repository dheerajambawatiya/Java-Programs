import java.util.Scanner;
class Sum{
	public static void main(String [] args)
	{
		int a , b , sum=0 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		a = sc.nextInt();
		while(a>0)
		{
			b = a%10;
			sum = sum+b;
			a = a/10;
			}
		System.out.print("Sum is:" + sum);
	}
}