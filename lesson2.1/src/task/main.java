package task;

public class main {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		r1.setLength(12);
		r1.setWidth(17);
		
		Rectangle r4 = new Rectangle(34, 60);

		System.out.println(r1);
		r1.scr();
		System.out.println(r4);
		r4.scr();
		
		System.out.println();
		
		circle f1 = new circle(23,11);
		System.out.println(f1);
		f1.qoaer();
		f1.scl();
	}

}
