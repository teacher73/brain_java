package abstract_class02;

public class Marine extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("(" + x + ", " + y + ")" + "로 이동"); 
	}
	void stimPack() {
		System.out.println("스팀 팩 사용");
	}
}
