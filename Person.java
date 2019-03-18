import java.util.Scanner;
enum Gender {
	Male , Female;
	public static Gender acceptGender() {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		if(str.trim().toLowerCase().equals("male"))		//It remove spaces and lower case.
			return Male;
		else
			return Female;
	}
};
class Person {
	protected String name;
	protected int age;
	protected Gender gender;	
	public Person() {
		name = new String();
		gender = Gender.Male;
	}
	public Person(String name , int age , Gender gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public void acceptData() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Name");
		name = in.nextLine();
		System.out.println("Enter Age");
		age = in.nextInt();
		System.out.println("Enter Gender");
		gender = Gender.acceptGender();
	}
	public void showData() {
		System.out.println("Name is :" +name);
		System.out.println("Age is :" +age);
		System.out.println("Gender is :" +gender);
	}
	public static void main(String args[]) {
		Person p = new Person();
		p.acceptData();
		p.showData();
	}
}
