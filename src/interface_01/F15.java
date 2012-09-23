package interface_01;

public class F15 extends Fighter{
	public F15(){
		System.out.println("나는 F15");
		setFlightBehavior(new PropellerFlight());
		setWeaponBehavior(new WaterGun());
	}
	public void display() {
		System.out.println("나는 F15");
	}
	public String toString(){
		return "F15";
	}
}
