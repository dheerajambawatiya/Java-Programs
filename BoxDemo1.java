class Box {
	double width;
	double height;
	double depth;
	void volume() {
		System.out.print("Volumn is:");
		System.out.print(width * height * depth);
	}
}
class BoxDemo1 {
	public static void main(String[] args) {
		Box mybox2 = new Box();
		Box mybox3 = new Box();
		mybox2.width = 10;
		mybox2.height = 20;
		mybox2.depth =  30;
		mybox3.width = 5;
		mybox3.height = 10;
		mybox3.depth =  15;
		mybox2.volume();
		System.out.println();	
		mybox3.volume();
		}
	}
	