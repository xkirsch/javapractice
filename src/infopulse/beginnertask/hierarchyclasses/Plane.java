package infopulse.beginnertask.hierarchyclasses;

public class Plane extends Vehicle {
	
	private int numberOfPassengers;
	private int height;
	public Plane(String modelName, double gpsX, double gpsY, double price, int speed, int yearOfManufacture, 
			int numberOfPassengers, int height) {
		super(modelName, gpsX, gpsY, price, speed, yearOfManufacture);
		this.numberOfPassengers = numberOfPassengers;
		this.height = height;
		
	}

	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}
	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Plane " +getModelName() +"[coordinate x = " + getGpsX() + ", coordinate y = " + getGpsY() + ", price = " + getPrice()
				+ " speed = " + getSpeed() + ", year of manufacture = " + getYearOfManufacture() + ", number of passengers = " + numberOfPassengers + ", height=" + height
				+"]";
	}
	
}
