import java.util.Scanner;
class Pattern7 {
	public static void main(String args[]) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value");
		n = sc.nextInt();
		System.out.println();
		for(int i=1;i<=n;i++) {
			for (int j=n;j>=i;j--) {
				System.out.print(j); //System.out.print(i);
			}
			System.out.println();
		}
	}
}