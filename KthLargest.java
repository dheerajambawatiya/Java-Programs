import java.util.Arrays;
import java.util.Collections;
class KthLargest {
	public static int kth(int[] arr, int k) {
    		Arrays.sort(arr);
    		int targetIndex = arr.length - k;
    		return arr[targetIndex];
	}
	public static void main(String args[]) {
		int arr[] = new int[] {4,7,5,8,1,9};
		int k = 3;
		System.out.println(kth(arr, k));
	}
}