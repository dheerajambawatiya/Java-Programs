class EnumTest {
	enum Books{MyBook , HisBook , YourBook};
	public static void main(String args[]) {
		Books b = Books.MyBook;
		if(b.equals(Books.MyBook))
			System.out.println("This is my book");
		else
			
			System.out.println("This is not my book");
		if(b == Books.MyBook)
			
			System.out.println("This is my book");
		else
			
			System.out.println("This is not my book");
		switch(b) {
			case MyBook:
				System.out.println("MyBook");
			break;
			case HisBook:	
				System.out.println("HisBook");
			break;
			case YourBook:
				System.out.println("YourBook");
			break;
		}
	}
}




// equals(), == ,switch works with enum
