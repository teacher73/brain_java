package abstract_class01;

public class Marine {
	int x, y;	//위치
	
	void move(int x, int y){ 
		System.out.println("(" + x + ", " + y + ")" + "로 이동"); 
	}
	
	void stop()	{ 
		System.out.println("현 위치에 정지"); 
	}
	
	void stimPack() {
		System.out.println("스팀 팩 사용");
	}
}
