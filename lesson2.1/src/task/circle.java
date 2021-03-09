package task;

public class circle {
	
	private int radius;
	private int diameter;
	
	circle(int radius, int diameter){
		this.radius = radius ;
		this.diameter= diameter;
	}
	
	public void scl ( ) {
		 System.out.println("Площа =" + 3.14 * (radius*2));
		}
	
	public void qoaer ( ) {
		 System.out.println("Довжина =" + 3.14 * diameter);
		}

	@Override
	public String toString() {
		return "circle [radius=" + radius + ", diameter=" + diameter + "]";
	}
	
	
	
	
}
