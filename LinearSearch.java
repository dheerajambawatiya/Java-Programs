import java.util.Scanner;
class LinearSearch {
	public static void main(String args []) {
		int c , n , search , arr[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers of elements :");
		n = sc.nextInt();
		arr = new int[n];
		System.out.println("Enter all elements :");
		for (c=0 ; c<n ; c++)
		arr[c] = sc.nextInt();
		System.out.println("Enter elemnts to be found");
		search = sc.nextInt();
		for (c=0 ; c<n ; c++) {
			if(arr[c] == search){
				System.out.println("Your number is present at position :" +(c+1));
				break;
			}
		}
		if(c == n)
			System.out.println("Your number is not present in the list");
	}
}