package abstract_class01;

import java.util.ArrayList;

public class TestDrive {

	public static void main(String[] args) {	
		ArrayList<Object> arr1 = new ArrayList<Object>();
		
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

	private static void moveUnit(ArrayList<Object> arr1) {
		for(Object unit:arr1){
			if (unit instanceof Marine) {
				Marine mar = (Marine)unit;
				System.out.println(mar.getClass().getName());
				mar.move(100, 100);
			}
			if (unit instanceof Tank) {
				Tank mar = (Tank)unit;
				System.out.println(mar.getClass().getName());
				mar.move(100, 100);
			}
			if (unit instanceof Dropship) {
				Dropship mar = (Dropship)unit;
				System.out.println(mar.getClass().getName());
				mar.move(100, 100);
			}
		}
	}

	private static void insertUnit(ArrayList<Object> arr1, Object marine1) {
		arr1.add(marine1);
	}

}
