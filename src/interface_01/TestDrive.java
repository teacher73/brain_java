package interface_01;

public class TestDrive {
	public static void main(String[] args) {
		F16 obj = new F16();
		F15 obj1 = new F15();
		
		readyFlight(obj);
		readyFlight(obj1);
		
		System.out.println(obj.getClass().getSimpleName());
		obj.setWeaponBehavior(new WaterGun());
		readyFlight(obj);
	}

	private static void readyFlight(Fighter obj) {
		System.out.println("========================");
		System.out.println(obj);
		obj.performFly();
		obj.shootingWeapon();
		System.out.println("========================");
	}
	
}
