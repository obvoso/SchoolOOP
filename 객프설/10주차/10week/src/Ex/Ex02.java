package Ex;

class Phone {
	protected String owner;
	
	Phone(String o) {
		this.owner = o;
	}
	void talk() {
		System.out.println(owner + "가 통화중입니다.");
	}
}

class Telephone extends Phone{
	private String when;
	
	Telephone(String n, String w) {
		super(n);
		this.when = w;
	}
	
	void autoAnswering() {
		System.out.println(this.owner + "가 부재중입니다. " + this.when + " 전화해주세요.");
	}
}

class Smartphone extends Telephone {
	private String game;
	
	Smartphone(String n, String w, String g) {
		super(n, w);
		this.game = g;
	}
	void playGame() {
		System.out.println(this.owner + "가 " + this.game + " 게임을 하는 중입니다.");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Phone[] phones = { new Phone("황진이"), new Telephone("길동이", "내일"),
				new Smartphone("민국이", null, "베그")};
		for(int i = 0; i < phones.length; i++) {
			if (phones[i] instanceof Smartphone) 
				((Smartphone)phones[i]).playGame();
			else if (phones[i] instanceof Telephone)
				((Telephone)phones[i]).autoAnswering();
			else
				phones[i].talk();
		}
	}
}
