import java.util.Scanner;
class Employee {
	protected String name;
	protected String depart;
	protected String desig;
	protected int salary;
		public String getName(){
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDepart(){
			return depart;
		}
		public void setDepart(String depart) {
			this.depart = depart;
		}
		public String getDesig(){
			return desig;
		}
		public void setDesig(String desig) {
			this.desig = desig;
		}
		public int getSalary(){
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public Employee(String name, String depart, String desig, int salary) {
			this.name = name;
			this.depart = depart;
			this.desig = desig;
			this.salary = salary;			}
		public void printData(){
			System.out.println("Name =" +this.name + "\nDepartment =" +this.depart + "\nDesignation =" +this.desig + "\nSalary = " +this.salary);
		}
		public float hra() {
					float h=((salary*20)/100);
					return h;
				}
		public float da() {
					float d = ((salary*10)/100);
					return d;
				}
		public float ca() {
					float c = ((salary*10)/100);
					return c;
				}
		public static void main(String args[]) {
			Employee e1 = new Employee("Dheeraj","HR","CEO",100000);
			e1.printData();
			float a = e1.hra();
			float b = e1.da();
			System.out.println("HRA:" + a + "\nDA:" + b + "\nCA:" + e1.ca());
		}
}