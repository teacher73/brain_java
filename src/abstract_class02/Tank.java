package abstract_class02;

public class Tank extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("(" + x + ", " + y + ")" + "로 이동"); 
	}
	
	void changeMode(){
		System.out.println("공격 모드 변환");
	}
}
