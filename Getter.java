class Getter{
private int x;
public int getX(){
	return x;
}public void setX(int a) {
	x=a; 
}
public static void main(String args[]) {
	Getter o = new Getter();	
	System.out.println(o.getX());
	o.setX(10);
	System.out.println(o.getX());
}
}