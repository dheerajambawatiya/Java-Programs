import java.util.Scanner;
public class VendingMachine {
	public static void main(String args[]) {
		int item;
		double count , total;
		Scanner sc = new Scanner(System.in);
		System.out.println("Following are the items we have \n1.Chips \n2.Chocolate \n3.Icecream \n4.Cold Drinks \n5.Biscuits");
		System.out.println("We accept coin of 1 & 5 ");
		do {
			count = sc.nextDouble();
			total = count;
			System.out.println("Please enter your money now (Press 0 to next)");
		 	System.out.print("Amount Entered:" +count);
			if(count >= 0.01 && count <=5) {
             			total = count;
        		}
			else if(count > 5) 
                	System.out.println("Please Enter Up To 5");
         		else
             		break;
        	}
		while(count!=0 || count <= 5);
		do {       
         		System.out.println("Enter item number (Press 0 to next):\t");      
         		item = sc.nextInt();       
			switch(item){                 
      				case 1: total -= 1.00;
                		System.out.println("Amount remaining:" +total); 
           		     	break;
             			case 2: count -= 1.00;
                		System.out.println("Amount remaining:" +count);  
                		break;               
             			case 3: count -= 0.50;
                		System.out.println("Amount remaining:" +count);                 
                		break;
             			case 4: count -= 1.25;
                		System.out.println("Amount remaining:" +count);  
                		break;
             			case 5: count -= 0.75;
                		System.out.println("Amount remaining:" +count);  
                		break;
             			case 0:  
                 		break;
        		 }
     		}
		while(item!=0 && count > 0);
		System.out.println("Please try another item and press 0 to return");  
	       	System.out.printf("Change:" , count);
	}
}