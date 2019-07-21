class intersection {
	static void print(int arr1[], int arr2[],int m, int n) {
		int i=0, j=0;
		System.out.println("Intersection in both array are ");
		while(i<m && j<n) {
			if(arr1[i] < arr2[j])
			i++;
			else if(arr2[j] < arr1[i])
			j++;
			else {
				System.out.println(arr2[j] + " ");
				i++;
			}
		}
	}
	public static void main(String args[]) {
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {1,2,3,7,8};
		int m = arr1.length;
		int n = arr2.length;
		print(arr1, arr2, m, n);
	}
}