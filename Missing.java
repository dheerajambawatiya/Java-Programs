public class Missing {
	static int MissingNum(int a[] , int n) {
		int i , total;
		total = (n+1) * (n+2) / 2;
		for (i=0 ; i<n ; i++)
		total -= a[i];
		return total;
	}
	public static void main(String args []) {
		int a[] = {1,2,3,4,6};
		int miss = MissingNum(a , 5);                      // 5 is length of array
		System.out.println("The missing number is : " +miss);
	}
} 