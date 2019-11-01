package infopulse.beginnertask.hierarchyclasses;

public class Car extends Vehicle implements MoveAble {

	public Car(String modelName, double gpsX, double gpsY, double price, int speed, int yearOfManufacture) {
		super(modelName, gpsX, gpsY, price, speed, yearOfManufacture);
		
	}

	@Override
	public String toString() {
		return "Car "+getModelName()+" [coordinate x = " + getGpsX() + ", coordinate y = " + getGpsY() + ", price = " + getPrice()
				+ " USD, speed = " + getSpeed() + ", year of manufacture = " + getYearOfManufacture() + "]";
	}

	@Override
	public int move() {
		return getSpeed();
	}

}

