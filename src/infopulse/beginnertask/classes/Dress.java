package infopulse.beginnertask.classes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Dress {
	int size;
	String modelname;
	String fiber;
	double price;

	Dress(String modelname, int size, double price, String fiber) {
		this.size = size;
		this.modelname = modelname;
		this.fiber = fiber;
		this.price = price;
	}

	public void print() {
		System.out.println("Model= " + this.modelname + "\n" + "Size= " + this.size + "\n" + "Price= " + this.price
				+ " EUR" + "\n" + "Fiber= " + this.fiber + "\n");

	}

	public void reduce(int salevalue) {
		double saleamount = (this.price / 100) * salevalue;
		this.price = this.price - saleamount;
		this.price = Math.round(this.price*100.0)/100.0;
		System.out.println("This model is now on " + salevalue + "% sale. Actual price is " + this.price + " EUR" + "\n");
	}

}