class EnumTest1 {
	enum Books { BookA , BookB , BookC};
	public static void main(String args[]) {
		System.out.println(Books.valueOf("BookC"));
		for (Books b : Books.values()) {
			System.out.println(b);
			System.out.println(b.ordinal());      	// ordinal() gives index of book
		}
	}
}