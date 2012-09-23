package interface_01;

public class MuchineGun implements WeaponBehavior {

	public MuchineGun() {
		System.out.println("기관총 장착");
	}

	@Override
	public void shootWeapon() {
		System.out.println("기관총 쏘다");
	}

}
