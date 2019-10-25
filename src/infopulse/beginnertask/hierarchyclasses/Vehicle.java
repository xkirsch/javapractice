package infopulse.beginnertask.hierarchyclasses;

import java.math.BigDecimal;

public class Vehicle {
	private String modelName;
private double gpsX;
private double gpsY;
private double price;
private int speed; 
private int yearOfManufacture;

public Vehicle(String modelName, double gpsX, double gpsY, double price, int speed, int yearOfManufacture) {
this.modelName = modelName;
	this.gpsX = gpsX;
	this.gpsY = gpsY;
	this.price = price;
	this.speed = speed;
	this.yearOfManufacture = yearOfManufacture;
}

public String getModelName() {
	return modelName;
}

public void setModelName(String modelName) {
	this.modelName = modelName;
}

public double getGpsX() {
	return gpsX;
}

public void setGpsX(double gpsX) {
	this.gpsX = gpsX;
}

public double getGpsY() {
	return gpsY;
}

public void setGpsY(double gpsY) {
	this.gpsY = gpsY;
}

public double getPrice() {
	
	return price;
}

public void setPrice(double price) {
	this.price = price;
	
}

public int getSpeed() {
	return speed;
}

public void setSpeed(int speed) {
	this.speed = speed;
}

public int getYearOfManufacture() {
	return yearOfManufacture;
}

public void setYearOfManufacture(int yearOfManufacture) {
	this.yearOfManufacture = yearOfManufacture;
}


}
