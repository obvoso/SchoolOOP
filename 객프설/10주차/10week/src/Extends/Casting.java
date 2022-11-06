package Extends;

class Parent {
	void print();
}

class Child extends Parent {
	
	@Override
	void print() {
		System.out.println("Child 메소드 호출");
	};
}

public class Casting {
	public static void main(String[] args) {
		Parent p = new Child(); //업캐스팅
		p.print();
		
		Child c = (Child)p;//다운캐스팅
		c.print(); // 메소드 오버라이딩
	}
}
