package infopulse.beginnertask.hierarchyclasses;

public class Amfibia extends Ship implements MoveAble, SwimAble  {

	public Amfibia(String modelName, double gpsX, double gpsY, double price, int speed, int yearOfManufacture,
			int numberOfPassengers, String homePort) {
		super(modelName, gpsX, gpsY, price, speed, yearOfManufacture, numberOfPassengers, homePort);
	
	}

	@Override
	public int swim() {
		
		return getSpeed()/2;
	}

	@Override
	public int move() {
	
		return getSpeed();
	}


}
