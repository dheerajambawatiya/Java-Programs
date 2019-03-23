class Box {
	double width;
	double height;
	double depth;
	Box(double w , double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
	double volume() {
		return width * height * depth;
	}
}

class BoxDemo2 {
	public static void main(String args[]) {
		Box mybox1 = new Box(10 , 15 , 20);
		Box mybox2 = new Box(2 , 4 , 6);
		double vol;
		vol = mybox1.volume();
		System.out.println("Volume is :" + vol);
		vol = mybox2.volume();
		System.out.println("Volume is :" + vol);
	}
}
