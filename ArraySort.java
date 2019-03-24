import java.util.Arrays; 
public class ArraySort {
	public static void main(String[] args) {   
		int[] arr = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254};
		String[] brr = {"Java" , "Python", "PHP", "C#", "C", "C++"};        
    		System.out.println("Original numeric array : "+Arrays.toString(arr));
    		Arrays.sort(arr);
    		System.out.println("Sorted numeric array : "+Arrays.toString(arr));
    		System.out.println("Original string array : "+Arrays.toString(brr));
    		Arrays.sort(brr);
    		System.out.println("Sorted string array : "+Arrays.toString(brr));
	}
}