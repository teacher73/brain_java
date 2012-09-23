package abstract_class03;

public class Unit {
	int x, y;
	
	void move(int x, int y) {
		System.out.println("(" + x + ", " + y + ")" + "로 이동"); 
	}
	
	void stop(){
		System.out.println("현재 위치에서 정지");
	}
}
