package interface_01;

public class RocketFlight implements FlightBehavior {

	public RocketFlight() {
		System.out.println("로켓추진체 장착");
	}

	@Override
	public void fly() {
		System.out.println("로켓 추진");
	}

}
