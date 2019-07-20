public class pair {
	public static void pairsCount(int[] arr, int sum) { 
		int count = 0; 
        	for (int i=0; i<arr.length; i++) 
            	for (int j=i+1; j<arr.length; j++) 
                if ((arr[i] + arr[j]) == sum) 
                    count++; 
        	System.out.printf("Count of pairs is " +count);
		} 
    	public static void main(String args[]) { 
	        int[] arr = {1,2,3,7,5,6,4,-1,-2,8 }; // Any value
        	int sum = 6; //Any sum you want to find pair of
        	pairsCount(arr, sum); 
    		} 
} 