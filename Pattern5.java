import java.util.Scanner;
class Pattern5 {
	public static void main(String args[]) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value");
		n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}