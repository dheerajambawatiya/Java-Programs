class commonInThree { 
	void common(int arr1[], int arr2[], int arr3[]) {
		int i=0, j=0, k=0;  
		while (i < arr1.length && j < arr2.length && k < arr3.length) {
			if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {   
				System.out.print(arr1[i]+" ");   
				i++; 
				j++; 
				k++; 
			} 
			else if (arr1[i] < arr2[j]) 
			i++;
			else if (arr2[j] < arr3[k]) 
			j++; 
			else
			k++; 
		} 
	} 
	public static void main(String args[]) { 
		commonInThree ob = new commonInThree(); 
		int arr1[] = {1,2,3,4,5,6,7,8,9}; 
		int arr2[] = {1,2,4,5,6,7,8,9}; 
		int arr3[] = {8,9,10,11,12};
		System.out.print("Common elements are "); 
		ob.common(arr1, arr2, arr3); 
	} 
}



				