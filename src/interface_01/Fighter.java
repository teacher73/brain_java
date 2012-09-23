package interface_01;

public abstract class Fighter {
	WeaponBehavior weaponBehavior;
	FlightBehavior flightBehavior;
	
	public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
		this.weaponBehavior = weaponBehavior;
	}

	public void setFlightBehavior(FlightBehavior flightBehavior) {
		this.flightBehavior = flightBehavior;
	}

	public void shootingWeapon(){
		weaponBehavior.shootWeapon();
	}
	
	public void performFly(){
		flightBehavior.fly();
	}
	
	public abstract void display();
}
