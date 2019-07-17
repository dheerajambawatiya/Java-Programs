import java.util.Scanner;
class FindNumber {
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5};
		int i = 3;     //number to find
		boolean j = false;
		for(int n : arr) {
			if(n == i) {
				j = true;
				break;
			}
		}
		if(j) 
			System.out.println("Number is present");
		else
			System.out.println("Number Not found");
	

	}
}	