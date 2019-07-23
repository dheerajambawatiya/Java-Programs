class Duplicate { 
	void duplicacy(int arr[], int size) { 
        	int i, j; 
        	System.out.println("Repeated Elements are :"); 
        	for (i=0; i<size; i++) { 
           		for (j =i+1; j<size;j++) {
	 		        if (arr[i] == arr[j])  
                    		System.out.print(arr[i] + " "); 
            		} 
        	} 
    	} 
	public static void main(String[] args) { 
	        Duplicate repeat = new Duplicate(); 
        	int arr[] = {1,2,3,1,4,5,2}; 
        	int size = arr.length; 
        	repeat.duplicacy(arr, size); 
    	} 
} 
