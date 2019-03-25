import java.util.Scanner;
public class Occurance {
	public static void main(String args[]) {
		int a , b , i=0 , count =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elemnts you want to store :");
		a = sc.nextInt();
		int n[] = new int[a];
		System.out.println("Enter all the elements:");
		for(i=0 ; i<a ; i++) {
			n[i] = sc.nextInt();
		}
		System.out.print("Enter the element you want to count of :");
		b = sc.nextInt();
		for(i=0 ; i<a ; i++) {
			if(n[i] == b) {
				count++;
			}
		}
		System.out.println("Number of occurance of your number in given array is :" +count);
	}
}			