package interface_01;

public class PropellerFlight implements FlightBehavior {

	public PropellerFlight() {
		System.out.println("프로펠러 추진체 장착");
	}

	@Override
	public void fly() {
		System.out.println("프로펠러 추진");
	}

}
