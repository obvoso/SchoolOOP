package Succession;

class Shape1 {
	protected int x, y;
	void print() {
		System.out.println("x좌표: " + x + "y좌표: " + y);
	}
	
}

class Rectanle extends Shape1 {
	int width, height;
	
	double calcArea() {
		return width * height;
	}
	void draw() {
		System.out.println("(" + x + "," + y + ") 위치에 " + "가로 : " + width +
				"세로: " + height);
	}
}

public class RectanleTest {
	public static void main(String[] args) {
		Rectanle r = new Rectanle(); 
	}
}
