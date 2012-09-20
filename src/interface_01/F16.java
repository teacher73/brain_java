package interface_01;

public class F16 extends Fighter{

	public F16(){
		System.out.println("나는 F16");
		setFlightBehavior(new RocketFlight());
		setWeaponBehavior(new MuchineGun());
	}
	public void display() {
		System.out.println("나는 F16");
	}
	public String toString(){
		return "F16";
	}
}
