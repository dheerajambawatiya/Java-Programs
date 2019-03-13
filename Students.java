import java.util.Scanner;
class Students {
	protected String name;
	protected char section;
	protected String cname;
	protected int marks[] = new int[4];
		public String getName(){
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCname(){
			return cname;
		}
		public void setClass(String cname) {
			this.cname = cname;
		}
		public char getSection(){
			return section;
		}
		public void setSection(char section) {
			this.section = section;
		}
		public Students(String name, String cname, char section) {
			this.cname = cname;
			this.name = name;
			this.section = section;
			}
		public void printData(){
			System.out.println("Name =" +this.name + "\nClass =" +this.cname + "\nSection =" +this.section);
}
		public void insertMarks()  {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter Marks");
			// marks = in.nextInt(); 
			for(int i=0;i<=3;i++)
			{
				marks[i] = in.nextInt();
				}
			}
		public int total() {
			int sum=0;
			for(int i=0;i<=3;i++) {
				sum=sum + marks[i];
			}
			return sum;
			}
	public static void main(String args[]) {
		Students s1 = new Students ("Dheeraj","Tenth",'A');
		s1.insertMarks();
		s1.printData();
		int total = s1.total();
		System.out.println("Total :" +total);
		System.out.println("Percentage :" + (total/4));	
	}
}
			
				
		