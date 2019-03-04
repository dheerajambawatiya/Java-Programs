import java.util.Scanner;
 
public class Pyramid
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter number of rows");
 
        int n = sc.nextInt();
 
        int r = 1;
 
        System.out.println("Here Is Your Pyramid");
 
        for (int i = n; i > 0; i--)
        {
 
            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }
 
            for (int j = 1; j <= r; j++)
            {
                System.out.print(r + " ");
            }
 
            System.out.println();
 
            r++;
        }
    }
}