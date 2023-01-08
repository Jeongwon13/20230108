abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() {}
}

class Marine extends Unit {
	void move(int x, int y) {
		System.out.println("Marine[x="+ + x + ", y:" + y + "]" );
	}
	void stimPack() {}
}

class Tank extends Unit {
	void move(int x, int y) {
		System.out.println("Tank[x="+ + x + ", y:" + y + "]" );
	}
	void changeMode() {}
}

class Dropship extends Unit {
	void move(int x, int y) {
		System.out.println("Dropship[x="+ + x + ", y:" + y + "]" );
	}
	void load() {}
	void unload() {}	
	}


public class Main {

	public static void main(String[] args) {
		Unit[] group = { new Marine(), new Tank(), new Dropship() };
		
		for(int i=0; i<group.length; i++) {
			group[i].move(102, 203); //move 메서드를 한번에 묶어서 사용 가능
		}
		
	}

}
