import java.util.Scanner;
class Identity {
	public static void main(String args []) {
	String name , add , num;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Name");
	name = sc.nextLine();
	System.out.println("Enter Address");
	add = sc.nextLine();
	System.out.println("Enter Number");
	num = sc.nextLine();
	System.out.println("Name is :" + name +"\nAddress is :" + add +"\nNumber is :"+num);
	}
}