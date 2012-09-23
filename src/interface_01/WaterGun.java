package interface_01;

public class WaterGun implements WeaponBehavior {

	public WaterGun(){
		System.out.println("물총 장착");
	}
	@Override
	public void shootWeapon() {
		System.out.println("물총 쏘다");
	}

}
