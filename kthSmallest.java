import java.util.Arrays; 
import java.util.Collections;   
class kthSmallest { 
	public static int kth (int[]arr,int k) { 
		Arrays.sort(arr); 
	return arr[k-1]; 
	}  
	public static void main(String[] args) { 
		int arr[] = new int[]{4,1,8,5,7,95}; 
		int k = 2; 
		System.out.print( "K'th smallest element is "+ kth(arr, k) );      
	} 
} 