package infopulse.beginnertask.hierarchyclasses;

public class Batmobile extends Car implements FlyAble, MoveAble, SwimAble {

	public Batmobile(String modelName, double gpsX, double gpsY, double price, int speed, int yearOfManufacture) {
		super(modelName, gpsX, gpsY, price, speed, yearOfManufacture);
	
	}

	@Override
	public int swim() {
		// TODO Auto-generated method stub
		return getSpeed()/2;
	}

	@Override
	public int move() {
	
		return getSpeed();
	}

	@Override
	public int fly() {
		
		return getSpeed()*3;
	}

	@Override
	public String toString() {
		return "BatMobile [toString()=" + super.toString() + "]";
	}

}
