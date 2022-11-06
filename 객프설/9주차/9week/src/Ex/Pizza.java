package Ex;

class Circle {
	protected int radius;
	
	public Circle(int r) {
		radius = r;
	}
}


public class Pizza extends Circle {
	
	String name;
	
	public Pizza(String name, int r) {
		super(r);
		this.name = name;
	}
	void print() {
		System.out.println("피자의 종류 : " + this.name + ", 피자의 크기 : " + this.radius);
	}
	
	public static void main(String args[]) {
		Pizza obj = new Pizza("Pepperoni", 20);
		obj.print();
	}

}
