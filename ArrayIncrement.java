import java.util.Scanner;
public class ArrayIncrement {
	public static void main(String args[]) {
		int n , i=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the elements :");
		for(i=0 ; i<n ; i++) {
			a[i] = sc.nextInt();
			a[i]++;
		}
		System.out.println("Elements after increment by 1 :");
		for(i=0 ; i<n ; i++) {
			System.out.println(a[i]);  //S.o.print(a[i] + " , ");
		}
		System.out.print(a[n-1]);
	}
}