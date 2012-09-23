package abstract_class02;

public abstract class Unit {
	int x, y;
	
	abstract void move(int x, int y);
	
	void stop(){
		System.out.println("현재 위치에서 정지");
	}
}
