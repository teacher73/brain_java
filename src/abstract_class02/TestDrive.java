package abstract_class02;

import java.util.ArrayList;

public class TestDrive {

	public static void main(String[] args) {

		ArrayList<Unit> arr1 = new ArrayList<Unit>();
		
		Marine marine1 = new Marine();
		Marine marine2 = new Marine();
		Tank tank1 = new Tank();
		Tank tank2 = new Tank();
		Dropship drop1 = new Dropship();
		Dropship drop2 = new Dropship();
		
		insertUnit(arr1, marine1);
		insertUnit(arr1, marine2);
		insertUnit(arr1, tank1);
		insertUnit(arr1, tank2);
		insertUnit(arr1, drop1);
		insertUnit(arr1, drop2);
		
		moveUnit(arr1);
	}

	private static void moveUnit(ArrayList<Unit> arr1) {
		for(Unit unit:arr1){
			System.out.println(unit.getClass().getName());
			unit.move(100, 100);
		}
	}
	
	private static void insertUnit(ArrayList<Unit> arrList, Unit obj) {
		arrList.add(obj);
	}
}
