package abstract_class03;

public class Dropship extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("(" + x + ", " + y + ")" + "로 이동"); 
	}
	
	void load() {
		System.out.println(" 타");
	}
	
	void unLoad(){
		System.out.println(" 내려");
	}
}
