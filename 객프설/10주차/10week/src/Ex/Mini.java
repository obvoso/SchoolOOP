package Ex;

import java.util.Scanner;

abstract class Sprite {
	int x;
	int y;
	
	abstract void move(char c);
}

class Man extends Sprite{
		
	Man(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void move(char c) {
		if (c == 'j' && y > 1)
			y -= 1;
		else if (c == 'k' && y < 8)
			y += 1;
		else if (c == 'h' && x > 1)
			x -= 1;
		else if (c == 'l' && x < 17)
			x += 1;
		else
			System.out.println("이동 불가. 다시 입력하세요.");
	}
}

class Monster extends Sprite{
		
	Monster(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void move(char c) {
		
		int hor = (int)(Math.random() * 2);
		int ver = (int)(Math.random() * 2);
		int tmpX = (int)(Math.random() * 6);
		int tmpY = (int)(Math.random() * 4);
		
		if (hor == 0 && ver == 0 && (x - tmpX) > 0 && (y - tmpY) > 0) {
			x -= tmpX;
			y -= tmpY;
		}
		else if (hor == 1 && ver == 0 && (x + tmpX) < 18 && (y - tmpY) > 0) {
			x += tmpX;
			y -= tmpY;
		}
		else if(hor == 0 && ver == 1 && (x - tmpX) > 0 && (y + tmpY) < 9) {
			x -= tmpX;
			y += tmpY;
		}
		else if(hor == 1 && ver == 1 && (x + tmpX) < 18 && (y + tmpY) < 9) {
			x += tmpX;
			y += tmpY;
		}
		else {
			x = tmpX + 1;
			y = tmpY + 1;
		}
		
	}
}

class Gold extends Sprite{
	
	Gold(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void move(char c) {};
}

public class Mini {
	
	public static char[][] mapInit(char[][] map) {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 19; j++) {
				if (i == 0 || i == 9)
					map[i][j] = '#';
				else if (j == 0 || j == 18)
					map[i][j] = '#';
				else
					map[i][j] = ' ';
			}
		}
		map[3][3] = '@';
		map[6][3] = 'G';
		map[7][7] = 'M';
		return (map);
	}
	
	public static void mapPrint(char[][] map) {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 19; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		char[][] map = new char[10][19]; 
		Scanner sc = new Scanner(System.in);
		char c;
		int exitFlag = 0;
		
		Man man = new Man(3, 3);
		Monster monster = new Monster(7, 7);
		Gold gold = new Gold(3, 6);
		
		mapInit(map);
		while (exitFlag != 1) {
			mapPrint(map);
			System.out.print("왼쪽(h), 위쪽(j), 아래쪽(k), 오른쪽(l) : ");
			c = sc.next().charAt(0);
			map[man.y][man.x] = ' ';
			map[monster.y][monster.x] = ' ';
			man.move(c);
			monster.move(c);
			map[man.y][man.x] = '@';
			map[monster.y][monster.x] = 'M';
			if (man.x == gold.x && man.y == gold.y)
			{
				System.out.println("\n******** YOU CATCH A GOLD. YOU WIN ********\n");
				exitFlag = 1;
			}
			if (man.x == monster.x && man.y == monster.y)
			{
				System.out.println("\n******** MONSTER CATCH UP YOU. YOU LOSE ********\n");
				exitFlag = 1;
			}
			if (monster.x == gold.x && monster.y == gold.y)
			{
				System.out.println("\n******** MONSTER CATCH A GOLD. YOU LOSE ********\n");
				exitFlag = 1;
			}
		}
	}
}
