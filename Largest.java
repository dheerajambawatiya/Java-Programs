import java.util.Scanner;
class Largest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter Size");
		int n;
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			}
		
		System.out.println(a[n-1] + "is largest");	
		System.out.println(a[n-2] + "is  second largest");
	}
}