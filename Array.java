import java.util.Scanner;
class Array
{
    public static void main(String[] args) 
    {
        int n, sum = 0,max=0,min=0;
        float avg=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements");
        for(int i = 0; i < n; i++)
        {
            a[i]=s.nextInt();
            sum=sum + a[i];
            avg = sum/n;
                if(max < a[i])
            {
                max = a[i];
            }
           else  
            min = a[i];
        }
        System.out.println("Sum"+sum);
           System.out.println("Avg"+avg);
           System.out.println("min"+min); 
           System.out.println("max"+max); 
    }
}
     
       
  