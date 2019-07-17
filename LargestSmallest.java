public class LargestSmallest {
        public static void main(String[] args) {
                int arr[] = new int[] {12,45,15,13,25,48,75,48,112};
                int smallest = arr[0];
                int largest = arr[0];
                for(int i=1; i< arr.length; i++) {
                        if(arr[i] > largest)
                        largest = arr[i];
                        else if (arr[i] < smallest)
                        smallest = arr[i];
                }
                System.out.println("Largest Number is : " + largest);
                System.out.println("Smallest Number is : " + smallest);
       }
}