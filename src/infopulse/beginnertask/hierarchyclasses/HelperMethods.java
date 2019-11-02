package infopulse.beginnertask.hierarchyclasses;

import java.util.ArrayList;

public class HelperMethods {
//average price 
	public static void ValueAveragePrice(ArrayList<Vehicle> list ) {
	 double averagePrice = 0;
	    double sum =0;
	    for (int j = 0; j < list.size(); j++) {
	         sum += list.get(j).getPrice();
	    }
	    averagePrice = sum / list.size();
	 System.out.println(averagePrice);
}
}