package infopulse.beginnertask.hierarchyclasses;

public class Ship extends Vehicle implements SwimAble {

private int numberOfPassengers;
private String homePort;

public Ship( String modelName, double gpsX, double gpsY, double price, int speed, int yearOfManufacture,
		int numberOfPassengers, String homePort) {
	super(modelName, gpsX, gpsY, price, speed, yearOfManufacture);
	this.numberOfPassengers = numberOfPassengers;
	this.homePort = homePort;
}

public int getNumberOfPassengers() {
	return numberOfPassengers;
}

public void setNumberOfPassengers(int numberOfPassengers) {
	this.numberOfPassengers = numberOfPassengers;
}

public String getHomePort() {
	return homePort;
}

public void setHomePort(String homePort) {
	this.homePort = homePort;
}

@Override
public String toString() {
	return "Ship " + getModelName() + " [coordinate x = " + getGpsX() + ", coordinate y = " + getGpsY() + ", price = " + getPrice() +" USD, speed = " + getSpeed() + ", year of manufacture = " + getYearOfManufacture() + " , number of passengers = " + numberOfPassengers + ", home port = " + homePort
			+ "]";
}

@Override
public int swim() {
	return getSpeed()/2;
}
}

