package Extends;

abstract class Shape2 {
	int x, y;
	public void translate(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public abstract void draw();
};

class Rectangle2 extends Shape2 {
	int width, height;
	public void draw() {
		System.out.println("사각형 그리기 메소드");
	}
};

class Circle2 extends Shape2 {
	int radius;
	public void draw() {
		System.out.println("원 그리기 메소드");
	}
};

public class AbstractShape {
	public static void main(String[] args) {
		//Shape s1 = new Shape2(); //오류 추상클래스로는 객체 생성 불가
		Shape2 s2 = new Circle2();
		Rectangle2 r1 = new Rectangle2();
		s2.draw();
		r1.draw();
	}

}
